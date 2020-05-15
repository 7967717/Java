package io.rr.builderfactory;

import lombok.SneakyThrows;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ObjectFactory {
    private List<ObjectConfigurator> objectConfigurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();
    private final ApplicationContext context;

    @SneakyThrows
    ObjectFactory(ApplicationContext context) {
        this.context = context;

//      finds and adds all objectConfigurators
        for (Class<? extends ObjectConfigurator> aClass : context.config().scanner().getSubTypesOf(ObjectConfigurator.class)) {
            objectConfigurators.add(aClass.getDeclaredConstructor().newInstance());
        }

//      finds and adds all proxyConfigurators
        for (Class<? extends ProxyConfigurator> aClass : context.config().scanner().getSubTypesOf(ProxyConfigurator.class)) {
            proxyConfigurators.add(aClass.getDeclaredConstructor().newInstance());
        }

    }

    @SneakyThrows
    public <T> T createObject(Class<T> implClass) {
//      creates objetc
        T t = create(implClass);

//      configure object
        configure(t);

//      run init methods
        invokeInit(implClass, t);

//      returns proxy if needed
        t = wrapWithProxyIfNeeded(implClass, t);

        return t;
    }

    private <T> T wrapWithProxyIfNeeded(Class<T> implClass, T t) {
        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.replaceWithProxyIfNeeded(t, implClass);
        }
        return t;
    }

    private <T> void invokeInit(Class<T> implClass, T t) throws IllegalAccessException, InvocationTargetException {
        for (Method method : implClass.getDeclaredMethods()) {
            if(method.isAnnotationPresent(PostConstruct.class)){
                method.invoke(t);
            }
        }
    }

    private <T> void configure(T t) {
        objectConfigurators.forEach(objectConfigurator -> objectConfigurator.configureObject(t, context));
    }

    private <T> T create(Class<T> implClass) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        return implClass.getDeclaredConstructor().newInstance();
    }
}
