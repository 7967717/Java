package io.rr.builderfactory;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    @Accessors(fluent = true)
    @Getter
    private Reflections scanner;
    private Map<Class, Class> infToClass;

    public JavaConfig(String packageToScan, Map<Class, Class> infToClass) {
        this.scanner = new Reflections(packageToScan);
        this.infToClass = infToClass;
    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> inf) {
        return infToClass.computeIfAbsent(inf, i -> {
            Set<Class<? extends T>> implementations = scanner.getSubTypesOf(inf);
            if(implementations.size() != 1) {
                throw new RuntimeException(inf + " has 0 or more than one implementation");
            }
            return implementations.iterator().next();});
        }
}
