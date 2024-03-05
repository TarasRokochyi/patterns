package org.example.structural.decorator;

public abstract class DrinkDecorator implements Drink{
    protected Drink Drink;

    public DrinkDecorator(Drink drink){
        Drink = drink;
    }
}
