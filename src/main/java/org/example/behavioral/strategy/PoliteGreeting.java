package org.example.behavioral.strategy;

public class PoliteGreeting implements GreetingStrategy{
    @Override
    public void greet() {
        System.out.println("Greetings, esteemed patron! How may we serve you today?");
    }
}
