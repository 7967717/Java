package io.rr.builderfactory;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public <T> void configureObject(T t, ApplicationContext context) {
        for (Field field : t.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                Class<?> fieldType = field.getType();
                Object value = context.getObject(fieldType);
                field.set(t, value);
            }
        }
    }
}
