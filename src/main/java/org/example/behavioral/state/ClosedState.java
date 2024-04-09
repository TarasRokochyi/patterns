package org.example.behavioral.state;

public class ClosedState implements TavernState{
    @Override
    public void enter() {
        System.out.println("the tavern is closed. Come back later");
    }

    @Override
    public void orderDrink() {
        System.out.println("sorry, the tavern is closed");
    }
}
