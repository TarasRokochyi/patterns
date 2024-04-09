package org.example.behavioral.strategy;

public class Owner {

    public String name;
    private GreetingStrategy greetingStrategy;

    public Owner(String name){
        this.name = name;
    }

    public void setGreetingStrategy(GreetingStrategy strategy){
        greetingStrategy = strategy;
    }

    public void greet(){
        greetingStrategy.greet();
    }
}
