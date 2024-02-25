package org.example.creational.singleton;

public class Tavern {

    private static Tavern tavern = null;
    private String Name;
    private int Rating;
    private String state = "close";

    public Tavern(){}

    public static Tavern getInstance(){
        if (tavern == null){
            tavern = new Tavern();
        }
        return tavern;
    }

    public void changeState(){
        if (state.equals("open")){
            state = "close";
        }
        else{
            state = "open";
        }
    }

    public String getState(){
        return state;
    }
}
