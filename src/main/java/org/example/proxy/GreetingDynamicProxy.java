package org.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GreetingDynamicProxy implements InvocationHandler {

    Object target;

    public GreetingDynamicProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logTrace();
        return method.invoke(target, args);
    }

    private void logTrace() {
        System.out.println("start to log trace...");
    }
}
