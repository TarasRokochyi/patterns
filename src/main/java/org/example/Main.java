package org.example;

import org.example.creational.builder.*;
import org.example.creational.factory.*;
import org.example.creational.factory.beverages.*;
import org.example.creational.prototype.Patron;
import org.example.creational.singleton.*;
import org.example.structural.adapter.*;
import org.example.structural.adapter.Rum;
import org.example.structural.bridge.DishB;
import org.example.structural.bridge.TavernKitchenB;
import org.example.structural.bridge.ChineseFood;
import org.example.structural.bridge.IndianFood;
import org.example.structural.composite.*;
import org.example.structural.decorator.*;
import org.example.structural.facade.TavernFacade;
import org.example.structural.flyweight.*;
import org.example.structural.proxy.*;

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

        System.out.println("\nADAPTER");
        Bartender bartender = new Bartender();
        Water water = new Water(500);
        bartender.Serve(water); // he can only serve water

        Rum rum = new Rum(300);
        // bartender.Serve(rum); cant serve alcohol rum
        RumAdapter adaptedRum = new RumAdapter(rum);
        bartender.Serve(adaptedRum); // but can serve adapted rum

        System.out.println("\nCOMPOSITE");
        Owner owner = new Owner("Bob");
        Manager manager1 = new Manager("Fred");
        Manager manager2 = new Manager("Sue");
        Waiter waiter1 = new Waiter("Ellen");
        Waiter waiter2 = new Waiter("Mark");
        Waiter waiter3 = new Waiter("Joe");

        manager1.Add(waiter1);
        owner.Add(manager1);

        manager2.Add(waiter2);
        manager2.Add(waiter3);
        owner.Add(manager2);

        owner.SayPosition();
        System.out.println();
        manager2.SayPosition();

        System.out.println("\nPROXY");
        TavernKitchen tavernKitchen = new TavernKitchen();
        KitchenProxy kitchenProxy = new KitchenProxy(tavernKitchen);

        long begin = System.currentTimeMillis();
        Dish dish1 = tavernKitchen.MakeDish("Salad");
        System.out.println("Dish one: " + dish1.NameOfTheDish());
        Dish dish2 = tavernKitchen.MakeDish("Salad");
        System.out.println("Dish two: " + dish2.NameOfTheDish());
        System.out.println("Elapsed time: " + (System.currentTimeMillis() - begin));

        begin = System.currentTimeMillis();
        dish1 = kitchenProxy.MakeDish("Soup");
        System.out.println("Dish one: " + dish1.NameOfTheDish());
        dish2 = kitchenProxy.MakeDish("Soup");
        System.out.println("Dish two: " + dish2.NameOfTheDish());
        System.out.println("Elapsed time: " + (System.currentTimeMillis() - begin));

        System.out.println("\nFLYWEIGHT");
        MealType mealType = MealTypeFactory.getMealType("decent", false);
        Meal breakfast = new Meal("breakfast", 400, mealType);
        System.out.println(breakfast);

        mealType = MealTypeFactory.getMealType("decent", false);
        Meal dinner = new Meal("dinner", 600, mealType);
        System.out.println(dinner);

        System.out.println("\nFACADE");
        TavernFacade tavern = new TavernFacade();
        tavern.OrderMeal("Chocolate Pudding at Lindeth Howe Country House");

        System.out.println("\nBRIDGE");
        ChineseFood chineseFood = new ChineseFood();
        IndianFood indianFood = new IndianFood();
        TavernKitchenB tavernKitchen1 = new TavernKitchenB(chineseFood);
        DishB dishB = tavernKitchen1.takeOrder("Kung Pao Chicken");
        System.out.println("Dish one is: " + dishB.Name);

        TavernKitchenB tavernKitchen2 = new TavernKitchenB(indianFood);
        dishB = tavernKitchen2.takeOrder("Biryani");
        System.out.println("Dish two is: " + dishB.Name);

        System.out.println("\nDECORATOR");
        Drink rum1 = new RumD();
        System.out.println("Cost: " + rum1.cost() + " Description: " + rum1.getDescription());
        rum1 = new Ice(rum1);
        System.out.println("Cost: " + rum1.cost() + " Description: " + rum1.getDescription());
        rum1 = new Lemon(rum1);
        System.out.println("Cost: " + rum1.cost() + " Description: " + rum1.getDescription());
    }
}