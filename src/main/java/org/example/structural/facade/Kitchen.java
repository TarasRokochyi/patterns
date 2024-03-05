package org.example.structural.facade;

public class Kitchen {
    public void prepareMeal(String mealName){
        System.out.println("preparing " + mealName);
    }

    public void getIngredients(String mealName){
        System.out.println("getting ingredients for " + mealName);
    }
}
