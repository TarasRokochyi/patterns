package org.example.structural.adapter;

public class Water {
    private int Mililiters;

    public Water(){}
    public Water(int mililiters){
        Mililiters = mililiters;
    }
    public void Serve(){
        System.out.println(Mililiters + " of water is served");
    }
}
