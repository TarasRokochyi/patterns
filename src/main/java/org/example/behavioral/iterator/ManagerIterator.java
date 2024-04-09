package org.example.behavioral.iterator;

import java.util.ArrayList;

public class ManagerIterator implements TavernIterator{
    private Manager[] managers;
    private int currentIndex;

    public ManagerIterator(Manager[] managers){
        this.managers = managers;
    }
    @Override
    public boolean hasNext() {
        return currentIndex < managers.length;
    }

    @Override
    public Manager getNext() {
        return managers[currentIndex++];
    }

    @Override
    public void reset() {
        currentIndex = 0;
    }
}
