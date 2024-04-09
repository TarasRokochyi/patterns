package org.example.behavioral.memento;

class TavernMemento {

    private String name;
    private int numCustomers;
    private int goldInTreasury;

    public TavernMemento(String name, int numCustomers, int goldInTreasury) {
        this.name = name;
        this.numCustomers = numCustomers;
        this.goldInTreasury = goldInTreasury;
    }

    public int getGoldInTreasury() {
        return goldInTreasury;
    }

    public int getNumCustomers() {
        return numCustomers;
    }

    public String getName() {
        return name;
    }
}
