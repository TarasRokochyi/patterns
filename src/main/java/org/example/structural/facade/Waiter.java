package org.example.structural.facade;

public class Waiter {

    public void ServeMeal(String mealName){
        System.out.println("serving " + mealName);
    }

    public void response(String mealName){
        System.out.println("enjoy your " + mealName);
    }
}
