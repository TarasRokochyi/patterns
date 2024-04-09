package org.example.behavioral.state;

public class OpenState implements TavernState{
    @Override
    public void enter() {
        System.out.println("you enter the tavern");
    }

    @Override
    public void orderDrink() {
        System.out.println("you ordered a drink");
    }
}
