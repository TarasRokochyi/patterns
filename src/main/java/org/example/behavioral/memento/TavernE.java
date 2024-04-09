package org.example.behavioral.memento;

public class TavernE {
    private String name;
    private int numCustomers;
    private int goldInTreasury;

    public TavernE(String name, int numCustomers, int goldInTreasury) {
        this.name = name;
        this.numCustomers = numCustomers;
        this.goldInTreasury = goldInTreasury;
    }

    public TavernMemento saveToMemento() {
        return new TavernMemento(name, numCustomers, goldInTreasury);
    }

    public void restore(TavernMemento memento){
        name = memento.getName();
        numCustomers = memento.getNumCustomers();
        goldInTreasury = memento.getGoldInTreasury();
    }

    public void setName(String name ){
        this.name = name;
    }

    public void setNumCustomers(int numCustomers){
        this.numCustomers = numCustomers;
    }

    public void setGoldInTreasury(int goldInTreasury){
        this.goldInTreasury = goldInTreasury;
    }

    @Override
    public String toString(){
        return "name: " + name + ", num of Customers: " + numCustomers + ", gold: " + goldInTreasury;
    }
}
