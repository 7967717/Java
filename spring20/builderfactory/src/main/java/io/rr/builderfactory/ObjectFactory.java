package io.rr.builderfactory;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObjectFactory {
    private static ObjectFactory instance = new ObjectFactory();
    private Config config;
    private List<ObjectConfigurator> objectConfigurators = new ArrayList<>();

    public static ObjectFactory getInstance() {
        return instance;
    }

    @SneakyThrows
    private ObjectFactory() {
        this.config = new JavaConfig("io.rr", new HashMap<Class, Class>() {{
            put(Cleaner.class, PlaceCleaner.class);
        }});

        for (Class<? extends ObjectConfigurator> aClass : config.scanner().getSubTypesOf(ObjectConfigurator.class)) {
            objectConfigurators.add(aClass.getDeclaredConstructor().newInstance());
        }

    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {

        Class<? extends T> implClass = type;

        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }

        T t = implClass.getDeclaredConstructor().newInstance();
        objectConfigurators.forEach(objectConfigurator -> objectConfigurator.configureObject(t));

        return t;
    }
}
