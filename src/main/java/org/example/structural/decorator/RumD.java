package org.example.structural.decorator;

public class RumD implements Drink{
    @Override
    public String getDescription() {
        return "Rum";
    }

    @Override
    public int cost() {
        return 5;
    }
}
