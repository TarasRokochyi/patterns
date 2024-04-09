package org.example.behavioral.state;

public class TavernS {
    private TavernState currentState;

    public TavernS(){
        currentState = new ClosedState();
    }

    public void setState(TavernState state){
        currentState = state;
    }

    public void enter(){
        currentState.enter();
    }

    public void orderDrink(){
        currentState.orderDrink();
    }
}
