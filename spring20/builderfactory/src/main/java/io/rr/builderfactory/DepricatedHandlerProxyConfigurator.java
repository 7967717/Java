package io.rr.builderfactory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DepricatedHandlerProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object replaceWithProxyIfNeeded(Object t, Class implClass) {
        if (implClass.isAnnotationPresent(Deprecated.class)) {
            if(implClass.getInterfaces().length == 0) {
                return Enhancer.create(implClass,
                        (InvocationHandler) (proxy, method, args) -> invocationHandlerLogic(t, method, args));
            }
            return Proxy.newProxyInstance(implClass.getClassLoader(),
                    implClass.getInterfaces(), (proxy, method, args) -> invocationHandlerLogic(t, method, args));
        } else {
            return t;
        }
    }

    private Object invocationHandlerLogic(Object t, Method method, Object[] args) throws IllegalAccessException, InvocationTargetException {
        System.out.println(t.getClass() + " !!!!!!!!!!!!! the class is deprecated");
        return method.invoke(t, args);
    }
}
