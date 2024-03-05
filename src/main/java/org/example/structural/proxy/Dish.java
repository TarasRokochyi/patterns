package org.example.structural.proxy;

public class Dish {
    private String Name;

    public Dish(String name){
        try{
            Thread.sleep(1000);
            Name = name;
        }catch (Exception ignored){}
    }

    public String NameOfTheDish(){
        return "This is " + Name;
    }
}
