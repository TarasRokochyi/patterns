package org.example.creational.factory;

import org.example.creational.factory.beverages.Beverage;

public abstract class BeverageFactory {

    public abstract Beverage getBeverage(BeverageType beverageType);

}
