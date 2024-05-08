package org.example;

//// CREATIONAL
//import org.example.creational.builder.*;
//import org.example.creational.factory.*;
//import org.example.creational.factory.beverages.*;
//import org.example.creational.prototype.Patron;
//import org.example.creational.singleton.*;


//// STRUCTURAL
//import org.example.structural.adapter.*;
//import org.example.structural.adapter.Rum;
//import org.example.structural.bridge.DishB;
//import org.example.structural.bridge.TavernKitchenB;
//import org.example.structural.bridge.ChineseFood;
//import org.example.structural.bridge.IndianFood;
//import org.example.structural.composite.*;
//import org.example.structural.decorator.*;
//import org.example.structural.facade.TavernFacade;
//import org.example.structural.flyweight.*;
//import org.example.structural.proxy.*;

// BEHAVIORAL
//import org.example.behavioral.chain_of_responsibility.*;
//import org.example.behavioral.command.*;
//import org.example.behavioral.iterator.*;
//import org.example.behavioral.mediator.*;
//import org.example.behavioral.memento.*;
//import org.example.behavioral.observer.*;
//import org.example.behavioral.state.*;
//import org.example.behavioral.strategy.*;
//import org.example.behavioral.template_method.*;
//import org.example.behavioral.visitor.*;

import org.example.code_smells.first.*;
import org.example.code_smells.second.LargeClass.Person;
import org.example.code_smells.second.LargeClass.Task;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       // // CREATIONAL
       // System.out.println("SINGLETON");
       // Tavern tavern1 = Tavern.getInstance();
       // tavern1.changeState();
       // System.out.println(tavern1.getState());
       // Tavern tavern2 = Tavern.getInstance();
       // System.out.println(tavern2.getState());

       // System.out.println("\nFACTORY");
       // NonAlcoholFactory nonAlcoholFactory = new NonAlcoholFactory();
       // Beverage beverage = nonAlcoholFactory.getBeverage(BeverageType.Coffee);
       // beverage.Type();
       // beverage = nonAlcoholFactory.getBeverage(BeverageType.Milk);
       // beverage.Type();

       // System.out.println("\nABSTRACT FACTORY");
       // AbstractFactory abstractFactory = new AbstractFactory();
       // BeverageFactory beverageFactory = abstractFactory.getBeverageFactory(FactoryType.Alcohol);
       // beverage = beverageFactory.getBeverage(BeverageType.Rum);
       // beverage.Type();
       // beverageFactory = abstractFactory.getBeverageFactory(FactoryType.NonAlcohol);
       // beverage = beverageFactory.getBeverage(BeverageType.Tea);
       // beverage.Type();

       // System.out.println("\nBUILDER");
       // RoomBuilder roomBuilder = new CheapRoomBuilder();
       // RoomDirector roomDirector = new RoomDirector(roomBuilder);
       // roomDirector.constructRoom();
       // System.out.println(roomDirector.getRoom());

       // roomBuilder = new DecentRoomBuilder();
       // roomDirector = new RoomDirector(roomBuilder);
       // roomDirector.constructRoom();
       // System.out.println(roomDirector.getRoom());

       // System.out.println("\nPROTOTYPE");
       // Patron patron = new Patron("Pippin", "Hobbit", "eat, smoke, sleep");
       // System.out.println(patron);
       // Patron prototype = (Patron) patron.doClone();
       // System.out.println(prototype);




       // // STRUCTURAL
       // System.out.println("\nADAPTER");
       // Bartender bartender = new Bartender();
       // Water water = new Water(500);
       // bartender.Serve(water); // he can only serve water

       // Rum rum = new Rum(300);
       // // bartender.Serve(rum); cant serve alcohol rum
       // RumAdapter adaptedRum = new RumAdapter(rum);
       // bartender.Serve(adaptedRum); // but can serve adapted rum

       // System.out.println("\nCOMPOSITE");
       // Owner owner = new Owner("Bob");
       // Manager manager1 = new Manager("Fred");
       // Manager manager2 = new Manager("Sue");
       // Waiter waiter1 = new Waiter("Ellen");
       // Waiter waiter2 = new Waiter("Mark");
       // Waiter waiter3 = new Waiter("Joe");

       // manager1.Add(waiter1);
       // owner.Add(manager1);

       // manager2.Add(waiter2);
       // manager2.Add(waiter3);
       // owner.Add(manager2);

       // owner.SayPosition();
       // System.out.println();
       // manager2.SayPosition();

       // System.out.println("\nPROXY");
       // TavernKitchen tavernKitchen = new TavernKitchen();
       // KitchenProxy kitchenProxy = new KitchenProxy(tavernKitchen);

       // long begin = System.currentTimeMillis();
       // Dish dish1 = tavernKitchen.MakeDish("Salad");
       // System.out.println("Dish one: " + dish1.NameOfTheDish());
       // Dish dish2 = tavernKitchen.MakeDish("Salad");
       // System.out.println("Dish two: " + dish2.NameOfTheDish());
       // System.out.println("Elapsed time: " + (System.currentTimeMillis() - begin));

       // begin = System.currentTimeMillis();
       // dish1 = kitchenProxy.MakeDish("Soup");
       // System.out.println("Dish one: " + dish1.NameOfTheDish());
       // dish2 = kitchenProxy.MakeDish("Soup");
       // System.out.println("Dish two: " + dish2.NameOfTheDish());
       // System.out.println("Elapsed time: " + (System.currentTimeMillis() - begin));

       // System.out.println("\nFLYWEIGHT");
       // MealType mealType = MealTypeFactory.getMealType("decent", false);
       // Meal breakfast = new Meal("breakfast", 400, mealType);
       // System.out.println(breakfast);

       // mealType = MealTypeFactory.getMealType("decent", false);
       // Meal dinner = new Meal("dinner", 600, mealType);
       // System.out.println(dinner);

       // System.out.println("\nFACADE");
       // TavernFacade tavern = new TavernFacade();
       // tavern.OrderMeal("Chocolate Pudding at Lindeth Howe Country House");

       // System.out.println("\nBRIDGE");
       // ChineseFood chineseFood = new ChineseFood();
       // IndianFood indianFood = new IndianFood();
       // TavernKitchenB tavernKitchen1 = new TavernKitchenB(chineseFood);
       // DishB dishB = tavernKitchen1.takeOrder("Kung Pao Chicken");
       // System.out.println("Dish one is: " + dishB.Name);

       // TavernKitchenB tavernKitchen2 = new TavernKitchenB(indianFood);
       // dishB = tavernKitchen2.takeOrder("Biryani");
       // System.out.println("Dish two is: " + dishB.Name);

       // System.out.println("\nDECORATOR");
       // Drink rum1 = new RumD();
       // System.out.println("Cost: " + rum1.cost() + " Description: " + rum1.getDescription());
       // rum1 = new Ice(rum1);
       // System.out.println("Cost: " + rum1.cost() + " Description: " + rum1.getDescription());
       // rum1 = new Lemon(rum1);
       // System.out.println("Cost: " + rum1.cost() + " Description: " + rum1.getDescription());



        // BEHAVIORAL

        // the request is passed down the logic, it checks if the request can be handled by something
        // there probably shouldnt be a return value but in this example this works, because the waiter responses to client about the failure
       // System.out.println("\nCoR");
       // Waiter waiter = new Waiter();
       // Bartender bartender = new Bartender();
       // Kitchen kitchen = new Kitchen();

       // waiter.addNext(bartender);
       // waiter.addNext(kitchen);

       // TavernRequest request = new TavernRequest(Type.FOOD);

       // waiter.handleRequest(request);

       // // the sender (Server) can execute multiple commands, it now depends on the command being sended to the constructor
       // System.out.println("\nCOMMAND");
       // Command serveDrinkCommand = new ServeDrinkCommand("Ale");
       // Command takeOrderCommand = new TakeOrderCommand("John", "Fish and chips");

       // Server server = new Server();

       // server.setCommand(serveDrinkCommand);
       // server.executeCommand();

       // server.setCommand(takeOrderCommand);
       // server.executeCommand();


       // // using iterator pattern, one can create own logic of iteration over some entity. Its not necessarily one by one iteration
       // System.out.println("\nITERATOR");
       // Tavern tavern = new Tavern();

       // TavernIterator iterator = tavern.getClientIterator();
       // System.out.println("Clients");
       // while(iterator.hasNext()){
       //     System.out.println(iterator.getNext().getName());
       // }

       // System.out.println("\nManagers");
       // iterator = tavern.getManagerIterator();
       // while(iterator.hasNext()){
       //     System.out.println(iterator.getNext().getName());
       // }


       // // the patron class triggers other classes not straight but via the mediator class.
       // System.out.println("\nMEDIATOR");
       // TavernM tavernM = new TavernM();

       // Patron patron = new Patron("Vitaliy");
       // patron.setMediator(tavernM);
       // patron.makeOrderDrink("tea with lemon");
       // patron.makeOrderFood("well-done steak");


       // // With this pattern the state of object can be saved, with caretaker (TavernOwner) the state can be restored or saved
       // System.out.println("\nMEMENTO");
       // TavernE tavernE = new TavernE("Wild Flask", 30, 45000);
       // TavernOwner tavernOwner = new TavernOwner();

       // System.out.println("Initial: \n" + tavernE);
       // tavernOwner.saveTavernState(tavernE);
       // tavernE.setName("Prancing mare");
       // tavernE.setNumCustomers(23);
       // tavernE.setGoldInTreasury(34000);
       // System.out.println("After change: \n" + tavernE);
       // tavernOwner.restoreTavernState(tavernE);
       // System.out.println("After restore:\n" + tavernE);


       // // this pattern allows you to notify subscribers when some event is happening
       // System.out.println("\nOBSERVER");
       // TavernO tavernO = new TavernO("Night Gate Tavern");
       // Customer customer = new Customer("Anton");
       // Cook cook = new Cook("Stepan");
       // tavernO.subscribe(customer);
       // tavernO.subscribe(cook);
       // tavernO.ChangeFoodType("indian");


       // // with this pattern you can define different classes states, and use them in some context
       // System.out.println("\nSTATE");
       // TavernS tavernS = new TavernS();
       // tavernS.enter();
       // tavernS.orderDrink();

       // tavernS.setState(new OpenState());
       // tavernS.enter();
       // tavernS.orderDrink();


       // // the object can behave differently respectivly to the strategy it has
       // System.out.println("\nSTRATEGY");
       // Owner owner = new Owner("Rick");
       // owner.setGreetingStrategy(new PoliteGreeting());
       // owner.greet();
       // owner.setGreetingStrategy(new WarmGreeting());
       // owner.greet();
       // owner.setGreetingStrategy(new EnthusiasticGreeting());
       // owner.greet();


       // // the abstract class defines the algorithm for the subclasess
       // System.out.println("\nTEMPLATE METHOD");
       // EnglishKitchen englishKitchen = new EnglishKitchen();
       // englishKitchen.prepareFood("oysters");
       // IndianKitchen indianKitchen = new IndianKitchen();
       // indianKitchen.prepareFood("oysters");
       // ItalianKitchen italianKitchen = new ItalianKitchen();
       // italianKitchen.prepareFood("oysters");


       // //
       // System.out.println("\nVISITOR");
       // TavernV tavernV = new TavernV("Wooden Lace Tavern");
       // BarmanV barmanV = new BarmanV("Morty");

       // ClientVisitor clientVisitor = new ClientVisitor("Lex");

       // tavernV.accept(clientVisitor);
       // barmanV.accept(clientVisitor);


        // Code Smells
        User user1 = new User("john_doe", "john.doe@example.com", "password1", "123 Main St", false);
        User user2 = new User("jane_smith", "jane.smith@example.com", "password2", "456 Elm St", false);
        User user3 = new User("alex_wong", "alex.wong@example.com", "password3", "789 Oak St", false);
        User user4 = new User("emily_jones", "emily.jones@example.com", "password4", "101 Maple St", false);
        User user5 = new User("michael_brown", "michael.brown@example.com", "password5", "111 Pine St", false);
        User admin1 = new User("admin", "admin@example.com", "adminpass1", "222 Cedar St", true);
        User admin2 = new User("superadmin", "superadmin@example.com", "adminpass2", "333 Birch St", true);
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(admin1);

        UserListProcessorAfter listProcessor = new UserListProcessorAfter(users);
        listProcessor.processUserList();
        listProcessor.addUser(admin2);
        listProcessor.processUser(admin2);
        listProcessor.sort();
        System.out.println("\nafter sorting");
        listProcessor.processUserList();
        System.out.println();
        System.out.println();

        Person person = new Person("taras", 18, "male");

        Person suizy = new Person("suizy", 23, "female");
        Person alex = new Person("alex", 28, "male");
        Person romeo = new Person("romeo", 12, "male");
        Person beverly = new Person("beverly", 31, "female");
        Person ricardo = new Person("ricardo", 45, "male");

        person.addEnemy(suizy);
        person.addEnemy(romeo);
        person.addFriend(alex);
        person.addFriend(beverly);
        person.addFriend(ricardo);

        person.addTask(new Task("do homework then i dont know something", "daily"));

        person.displayInfo();





    }
}