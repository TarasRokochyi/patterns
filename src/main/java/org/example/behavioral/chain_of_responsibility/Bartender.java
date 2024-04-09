package org.example.behavioral.chain_of_responsibility;

public class Bartender extends TavernHandler {

    @Override
    public boolean handleRequest(TavernRequest request) {
        if (request.Type() == Type.DRINK){
            System.out.println("Request is handled by bartender");
            // handling the request
            return true;
        }
        else if(Next != null){
            for (TavernHandler next : Next)
                if(next.handleRequest(request)){
                    return true;
                }
        }
        return false;
    }
}
