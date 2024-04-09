package org.example.behavioral.iterator;

public class Tavern implements TavernIterable{
    private Client[] clients;
    private Manager[] managers;

    public Tavern(){
        clients = new Client[3];
        clients[0] = new Client("John");
        clients[1] =  new Client("Alice");
        clients[2] =  new Client("Bob");

        managers = new Manager[3];
        managers[0] = new Manager("David");
        managers[1] = new Manager("Alex");
        managers[2] = new Manager("Virginia");
    }

    @Override
    public ClientIterator getClientIterator() {
        return new ClientIterator(clients);
    }

    @Override
    public ManagerIterator getManagerIterator() {
        return new ManagerIterator(managers);
    }
}
