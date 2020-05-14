package io.rr.builderfactory;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public <T> void configureObject(T t) {
        for (Field field : t.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                Class<?> fieldType = field.getType();
                Object value = ObjectFactory.getInstance().createObject(fieldType);
                field.set(t, value);
            }
        }
    }
}
