package org.example.structural.bridge;

public class TavernKitchenB {
    protected Food FoodType;

    public TavernKitchenB(Food foodType){
        FoodType = foodType;
    }

    public DishB takeOrder(String name){
        if (FoodType.hasDish(name)){
            return makeDish(name);
        }
        System.out.println("sorry, there is no " + name);
        return null;
    }

    private DishB makeDish(String name){
        String ingredients = FoodType.getIngredints(name);
        DishB dish = FoodType.makeDish(name, ingredients);
        return dish;
    }
}
