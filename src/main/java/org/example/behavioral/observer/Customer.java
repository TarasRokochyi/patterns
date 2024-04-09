package org.example.behavioral.observer;

public class Customer implements TavernSubscriber{
    public String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public void onChangedFoodType() {
        System.out.println("the customer is notified that food type is changed");
    }
}
