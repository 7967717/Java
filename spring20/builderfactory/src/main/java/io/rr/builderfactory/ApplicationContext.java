package io.rr.builderfactory;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {
    @Setter
    private ObjectFactory objectFactory;
    private Map<Class, Object> beanMap = new ConcurrentHashMap<>();
    @Accessors(fluent = true)
    @Getter
    private Config config;

    public ApplicationContext(Config config) {
        this.config = config;
    }

    public <T> T getObject(Class<T> type) {
        if(beanMap.containsKey(type)){
            return (T) beanMap.get(type);
        }

        Class<? extends T> implClass = type;
//      finds declared implementation
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }

        T t = objectFactory.createObject(implClass);

        if(implClass.isAnnotationPresent(Singleton.class)){
            beanMap.put(type, t);
        }

        return t;
    }

}
