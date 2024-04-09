package org.example.behavioral.chain_of_responsibility;

public class TavernRequest {
    private Type type;
    public TavernRequest(Type type){
        this.type = type;
    }

    public Type Type(){
        return type;
    }
}
