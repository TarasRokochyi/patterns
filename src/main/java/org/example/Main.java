package org.example;

import org.example.creational.builder.*;
import org.example.creational.factory.*;
import org.example.creational.factory.beverages.*;
import org.example.creational.prototype.Patron;
import org.example.creational.singleton.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("SINGLETON");
        Tavern tavern1 = Tavern.getInstance();
        tavern1.changeState();
        System.out.println(tavern1.getState());
        Tavern tavern2 = Tavern.getInstance();
        System.out.println(tavern2.getState());

        System.out.println("\nFACTORY");
        NonAlcoholFactory nonAlcoholFactory = new NonAlcoholFactory();
        Beverage beverage = nonAlcoholFactory.getBeverage(BeverageType.Coffee);
        beverage.Type();
        beverage = nonAlcoholFactory.getBeverage(BeverageType.Milk);
        beverage.Type();

        System.out.println("\nABSTRACT FACTORY");
        AbstractFactory abstractFactory = new AbstractFactory();
        BeverageFactory beverageFactory = abstractFactory.getBeverageFactory(FactoryType.Alcohol);
        beverage = beverageFactory.getBeverage(BeverageType.Rum);
        beverage.Type();
        beverageFactory = abstractFactory.getBeverageFactory(FactoryType.NonAlcohol);
        beverage = beverageFactory.getBeverage(BeverageType.Tea);
        beverage.Type();

        System.out.println("\nBUILDER");
        RoomBuilder roomBuilder = new CheapRoomBuilder();
        RoomDirector roomDirector = new RoomDirector(roomBuilder);
        roomDirector.constructRoom();
        System.out.println(roomDirector.getRoom());

        roomBuilder = new DecentRoomBuilder();
        roomDirector = new RoomDirector(roomBuilder);
        roomDirector.constructRoom();
        System.out.println(roomDirector.getRoom());

        System.out.println("\nPROTOTYPE");
        Patron patron = new Patron("Pippin", "Hobbit", "eat, smoke, sleep");
        System.out.println(patron);
        Patron prototype = (Patron) patron.doClone();
        System.out.println(prototype);
    }
}