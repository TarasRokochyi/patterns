package org.example.behavioral.chain_of_responsibility;

public interface Handler {
    boolean handleRequest(TavernRequest request);
}
