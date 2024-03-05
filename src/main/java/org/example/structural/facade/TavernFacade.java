package org.example.structural.facade;

import org.example.structural.proxy.TavernKitchen;

public class TavernFacade {
    public Menu menu;
    public Waiter waiter;
    public Kitchen kitchen;


    public TavernFacade(){
        menu = new Menu();
        waiter = new Waiter();
        kitchen = new Kitchen();
    }

    public void OrderMeal(String mealName){
        if (menu.HasMeal(mealName)){
            kitchen.getIngredients(mealName);
            kitchen.prepareMeal(mealName);
            waiter.ServeMeal(mealName);
            waiter.response(mealName);
            return;
        }
        System.out.println("sorry, there is no such meal in our menu");
    }
}
