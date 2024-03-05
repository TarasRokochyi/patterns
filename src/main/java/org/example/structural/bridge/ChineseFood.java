package org.example.structural.bridge;

import java.util.HashMap;
import java.util.Map;

public class ChineseFood implements Food{

    private Map<String, String> dishes = new HashMap<>();

    public ChineseFood(){
        dishes.put("Kung Pao Chicken", "stir-fried chicken, peanuts, vegetables, peppers");
        dishes.put("Sweet and Sour Pork", "deep-fried pork, onions pineapple, green pepper");
        dishes.put("Mapo Tofu", "tofu, bean paste, beef, hot roasted chilli oil");
    }
    @Override
    public boolean hasDish(String name) {
        return dishes.containsKey(name);
    }

    @Override
    public String getIngredints(String name) {
        return dishes.get(name);
    }

    @Override
    public DishB makeDish(String name, String ingredients) {
        System.out.println("getting " + ingredients + " for " + name);
        System.out.println("making " + name);
        return new DishB(name);
    }
}
