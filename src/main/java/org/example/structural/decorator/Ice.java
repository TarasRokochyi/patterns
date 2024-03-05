package org.example.structural.decorator;

public class Ice extends DrinkDecorator{

    public Ice(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return Drink.getDescription() + " with ice";
    }

    @Override
    public int cost() {
        return Drink.cost() + 1;
    }
}
