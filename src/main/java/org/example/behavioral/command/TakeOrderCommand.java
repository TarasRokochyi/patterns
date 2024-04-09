package org.example.behavioral.command;

public class TakeOrderCommand implements Command{
    private final String customerName;
    private final String order;

    public TakeOrderCommand(String customerName, String order) {
        this.customerName = customerName;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Taking order from " + customerName + ": " + order);
        // Logic to take the order
    }
}
