package org.example.structural.adapter;

public class RumAdapter extends Water{
    public Rum Rum;

    public RumAdapter(Rum rum){
        this.Rum = rum;
    }

    @Override
    public void Serve(){
        System.out.println(Rum.Mililiters + " of rum is served");
    }
}
