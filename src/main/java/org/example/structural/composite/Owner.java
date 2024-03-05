package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Owner extends Employee{
    List<Employee> employees = new ArrayList<>();

    public Owner(String name){
        super(name);
    }

    @Override
    public void SayPosition() {
        System.out.println("Owner "+Name);
        for (Employee employee : employees){
            employee.SayPosition();
        }
    }

    public void Add(Employee employee){
        employees.add(employee);
    }
}
