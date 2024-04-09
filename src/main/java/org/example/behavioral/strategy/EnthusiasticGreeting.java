package org.example.behavioral.strategy;

public class EnthusiasticGreeting implements GreetingStrategy {
    @Override
    public void greet() {
        System.out.println("Hello there! Welcome to the liveliest tavern in town!");
    }
}
