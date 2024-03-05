package org.example.structural.composite;

abstract class Employee {
    public String Name;

    public Employee(String name){
        Name = name;
    }

    abstract void SayPosition();
}
