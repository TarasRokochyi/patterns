package org.example.creational.factory;

import org.example.creational.factory.beverages.*;

public class NonAlcoholFactory extends BeverageFactory{
    @Override
    public Beverage getBeverage(BeverageType beverageType) {
        return switch (beverageType){
            case Tea -> new Tea();
            case Coffee -> new Coffee();
            case Milk -> new Milk();
            default -> new Coffee();
        };
    }

}
