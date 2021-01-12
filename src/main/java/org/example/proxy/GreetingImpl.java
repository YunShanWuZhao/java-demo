package org.example.proxy;

public class GreetingImpl implements Greeting{

    @Override
    public void doGreeting() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ding ding ding greeting...");
    }
}
