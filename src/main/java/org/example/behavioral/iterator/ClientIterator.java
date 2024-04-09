package org.example.behavioral.iterator;

public class ClientIterator implements TavernIterator{

    private Client[] clients;
    private int currentIndex;

    public ClientIterator(Client[] clients){
        this.clients = clients;
    }
    @Override
    public boolean hasNext() {
        return currentIndex < clients.length;
    }

    @Override
    public Client getNext() {
        return clients[currentIndex++];
    }

    @Override
    public void reset() {
        currentIndex = 0;
    }
}
