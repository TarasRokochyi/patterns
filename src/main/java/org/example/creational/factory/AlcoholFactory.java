package org.example.creational.factory;

import org.example.creational.factory.beverages.*;

public class AlcoholFactory extends BeverageFactory{
    @Override
    public Beverage getBeverage(BeverageType beverageType) {
        return switch (beverageType) {
            case Beer -> new Beer();
            case Wine -> new Wine();
            case Rum -> new Rum();
            default -> new Rum();
        };
    }
}
