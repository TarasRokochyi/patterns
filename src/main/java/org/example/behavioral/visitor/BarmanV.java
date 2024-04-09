package org.example.behavioral.visitor;

import org.example.behavioral.chain_of_responsibility.Bartender;

public class BarmanV implements Visitable{
    public String name;

    public BarmanV(String name){
        this.name = name;
    }
    @Override
    public void accept(TavernVisitor visitor) {
        visitor.visit(this);
    }
}
