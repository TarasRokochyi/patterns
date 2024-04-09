package org.example.behavioral.iterator;

public class Client implements Person{
    private String name;

    public Client(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
