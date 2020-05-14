package io.rr.builderfactory;

import org.reflections.Reflections;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> type);

    Reflections scanner();
}
