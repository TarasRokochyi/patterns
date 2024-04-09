package org.example.behavioral.chain_of_responsibility;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;

public class Waiter extends TavernHandler {

    @Override
    public boolean handleRequest(TavernRequest request) {
        if(Next != null){
            for (TavernHandler next : Next)
                if(next.handleRequest(request)){
                    return true;
                }
        }
        System.out.println("There was a problem, your request was not processed");
        return false;
    }
}
