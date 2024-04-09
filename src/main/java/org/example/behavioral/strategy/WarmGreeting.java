package org.example.behavioral.strategy;

public class WarmGreeting implements GreetingStrategy{
    @Override
    public void greet() {
        System.out.println("Welcome to our cozy tavern! Grab a seat by the fireplace");
    }
}
