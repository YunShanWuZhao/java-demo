package org.example.proxy;

public class GreetingProxy implements Greeting{

    private GreetingImpl greetingImpl;

    public GreetingProxy(GreetingImpl greetingImpl) {
        this.greetingImpl = greetingImpl;
    }

    @Override
    public void doGreeting() {
        System.out.println("start time:"+System.currentTimeMillis());
        greetingImpl.doGreeting();
        System.out.println("end time:"+System.currentTimeMillis());
    }
}
