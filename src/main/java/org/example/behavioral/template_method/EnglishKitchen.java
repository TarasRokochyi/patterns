package org.example.behavioral.template_method;

public class EnglishKitchen extends KitchenT {
    @Override
    void getOrder(String food) {
        System.out.println("getting order from client");
        orderName = food;
    }

    @Override
    void serveFood(String food) {
        System.out.println("serving cooked food for the client");
    }

    @Override
    void gettingIngredients(String food) {
        System.out.println("getting ingredients from fridge for " + orderName);
    }
}
