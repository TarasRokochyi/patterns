package org.example.structural.bridge;

import java.util.HashMap;
import java.util.Map;

public class IndianFood implements Food {
    private Map<String, String> dishes = new HashMap<>();

    public IndianFood(){
        dishes.put("Biryani", "rice, spices, meat");
        dishes.put("Butter chicken", "butter, tomatoes, chicken");
        dishes.put("Samosa", "flour, vegetables, spices, chilli, cheese");
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
