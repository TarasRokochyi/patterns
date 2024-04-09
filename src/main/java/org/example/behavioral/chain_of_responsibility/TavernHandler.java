package org.example.behavioral.chain_of_responsibility;

import java.util.ArrayList;
import java.util.Collection;

public abstract class TavernHandler implements Handler{
    protected ArrayList<TavernHandler> Next = new ArrayList<>();

    public void addNext(TavernHandler handler){
        Next.add(handler);
    }
}
