package org.example.behavioral.mediator;

public class TavernM implements TavernMediator{
    private Barman barman;
    private Cooker cooker;

    public TavernM(){
        barman = new Barman("John");
        barman.setMediator(this);
        cooker = new Cooker("Alice");
        cooker.setMediator(this);
    }
    @Override
    public void prepareDrink(String drink, Patron sender) {
        barman.makeDrink(drink, sender);
    }

    @Override
    public void prepareFood(String food, Patron sender) {
        cooker.makeFood(food, sender);
    }

    @Override
    public void serveOrder(String order, Patron receiver) {
        receiver.receiveOrder(order);
    }
}
