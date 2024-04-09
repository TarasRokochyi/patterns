package org.example.behavioral.mediator;

public interface TavernMediator {
    void prepareDrink(String drink, Patron sender);

    void prepareFood(String food, Patron sender);

    void serveOrder(String order, Patron receiver);
}
