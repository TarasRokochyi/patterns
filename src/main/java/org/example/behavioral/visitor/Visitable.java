package org.example.behavioral.visitor;

public interface Visitable {
    void accept(TavernVisitor visitor);
}
