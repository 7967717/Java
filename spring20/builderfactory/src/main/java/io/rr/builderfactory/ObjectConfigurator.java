package io.rr.builderfactory;

public interface ObjectConfigurator {
    <T> void configureObject(T t, ApplicationContext context);
}
