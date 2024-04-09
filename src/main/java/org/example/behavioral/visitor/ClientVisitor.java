package org.example.behavioral.visitor;

public class ClientVisitor implements TavernVisitor{
    public String name;

    public ClientVisitor(String name){
        this.name = name;
    }

    @Override
    public void visit(TavernV tavern) {
        System.out.println(name + " visits the " + tavern.name);
    }

    @Override
    public void visit(BarmanV barman) {
        System.out.println(name + " interacts with " + barman.name);
    }
}
