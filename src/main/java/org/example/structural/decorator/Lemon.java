package org.example.structural.decorator;

public class Lemon extends DrinkDecorator{
    public Lemon(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return Drink.getDescription() + " with lemon";
    }

    @Override
    public int cost() {
        return Drink.cost() + 1;
    }
}
