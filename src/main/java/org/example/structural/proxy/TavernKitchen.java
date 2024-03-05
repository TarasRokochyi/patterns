package org.example.structural.proxy;

public class TavernKitchen implements Kitchen{
    @Override
    public Dish MakeDish(String name) {
        return new Dish(name);
    }
}
