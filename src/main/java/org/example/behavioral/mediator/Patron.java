package org.example.behavioral.mediator;

public class Patron implements Fellow{

    private String name;

    private TavernMediator tavern;

    public Patron(String name){
        this.name = name;
    }

    public void makeOrderDrink(String drink){
        if(tavern != null){
            tavern.prepareDrink(drink, this);
        }
    }

    public void makeOrderFood(String food){
        if(tavern != null){
            tavern.prepareFood(food, this);
        }
    }

    public void receiveOrder(String order){
        System.out.println(name + " received order " + order);
    }
    @Override
    public void setMediator(TavernMediator tavern) {
        this.tavern = tavern;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
