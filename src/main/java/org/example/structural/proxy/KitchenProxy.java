package org.example.structural.proxy;

import java.util.HashMap;

public class KitchenProxy implements Kitchen{
    private Kitchen Kitchen;
    HashMap<String, Dish> dishCache = new HashMap<>();

    public KitchenProxy(Kitchen kitchen){
        Kitchen = kitchen;
    }

    @Override
    public Dish MakeDish(String name) {
        Dish dish = dishCache.get(name);
        if (dish == null) {
            dish = Kitchen.MakeDish(name);
            dishCache.put(name, dish);
            return dish;
        }
        return dish;
    }

    public void reset(){
        dishCache.clear();
    }
}
