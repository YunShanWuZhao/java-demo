package org.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        //静态代理
        /*Greeting greeting = new GreetingProxy(new GreetingImpl());
        greeting.doGreeting();*/

        //动态代理
        //Object greeting =  Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), Greeting.class.getInterfaces(), new GreetingDynamicProxy());
        GreetingImpl greetingImpl = new GreetingImpl();
        ClassLoader classLoader = greetingImpl.getClass().getClassLoader();
        Class[] interfaces = greetingImpl.getClass().getInterfaces();
        InvocationHandler invocationHandler = new GreetingDynamicProxy(greetingImpl);
        Greeting greeting = (Greeting)Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        greeting.doGreeting();
    }
}
