package org.example.creational.factory;

public class AbstractFactory {

    public BeverageFactory getBeverageFactory(FactoryType factoryType){
        return switch (factoryType){
            case Alcohol -> new AlcoholFactory();
            case NonAlcohol -> new NonAlcoholFactory();
        };
    }
}
