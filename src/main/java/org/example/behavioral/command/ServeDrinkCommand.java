package org.example.behavioral.command;

public class ServeDrinkCommand implements Command{
    private final String drinkName;

    public ServeDrinkCommand(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public void execute() {
        System.out.println("Serving " + drinkName);
        // Logic to serve the drink
    }
}
