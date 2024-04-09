package org.example.behavioral.mediator;

public class Barman implements Fellow{
    private String name;

    private TavernMediator tavern;

    public Barman(String name){
        this.name = name;
    }

    public void makeDrink(String drink, Patron sender){
        System.out.println("barman is making the " + drink + " for " + sender.getName());
        tavern.serveOrder(drink, sender);
    }

    @Override
    public void setMediator(TavernMediator tavern) {
        this.tavern = tavern;
    }

    @Override
    public String getName() {
        return name;
    }
}
