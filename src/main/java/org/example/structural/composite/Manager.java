package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    List<Employee> employees = new ArrayList<>();

    public Manager(String name){
        super(name);
    }

    @Override
    public void SayPosition() {
        System.out.println("Manager "+Name);
        for (Employee employee : employees){
            employee.SayPosition();
        }
    }

    public void Add(Employee employee){
        employees.add(employee);
    }
}
