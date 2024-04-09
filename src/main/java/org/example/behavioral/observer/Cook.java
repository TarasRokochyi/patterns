package org.example.behavioral.observer;


public class Cook implements TavernSubscriber {
    public String name;

    public Cook(String name){
        this.name = name;
    }

    @Override
    public void onChangedFoodType() {
        System.out.println("the cook is notified that food type is changed");
    }
}
