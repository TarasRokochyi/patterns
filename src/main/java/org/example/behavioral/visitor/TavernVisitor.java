package org.example.behavioral.visitor;

public interface TavernVisitor {
    void visit(TavernV tavern);
    void visit(BarmanV barman);
}
