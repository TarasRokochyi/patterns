package org.example.behavioral.observer;

import java.util.ArrayList;

public class TavernO {
    public String name;
    public String todayFoodType;
    ArrayList<TavernSubscriber> subscribers;

    public TavernO(String name){
        this.name = name;
        todayFoodType = "Chinese";
        subscribers = new ArrayList<>();
    }

    public void subscribe(TavernSubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(TavernSubscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void ChangeFoodType(String foodType){
        todayFoodType = foodType;
        for(TavernSubscriber sub : subscribers){
            sub.onChangedFoodType();
        }
    }
}
