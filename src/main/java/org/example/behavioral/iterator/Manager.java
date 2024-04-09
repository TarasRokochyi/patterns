package org.example.behavioral.iterator;

public class Manager implements Person{
    private String name;

    public Manager(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
