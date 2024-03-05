package org.example.structural.composite;

public class Waiter extends Employee{

    public Waiter(String name){
        super(name);
    }

    @Override
    public void SayPosition() {
        System.out.println("Waiter "+Name);
    }
}
