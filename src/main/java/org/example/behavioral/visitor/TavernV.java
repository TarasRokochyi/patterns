package org.example.behavioral.visitor;

public class TavernV implements Visitable{
    public String name;

    public TavernV(String name){
        this.name = name;
    }

    @Override
    public void accept(TavernVisitor visitor) {
        visitor.visit(this);
    }
}
