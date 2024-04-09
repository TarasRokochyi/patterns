package org.example.behavioral.mediator;

public class Cooker implements Fellow {

    private String name;

    private TavernMediator tavern;

    public Cooker(String name){
        this.name = name;
    }

    public void makeFood(String food, Patron sender){
        System.out.println("cooker is making the " + food + " for " + sender.getName());
        tavern.serveOrder(food, sender);
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
