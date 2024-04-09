package org.example.behavioral.template_method;

public class ItalianKitchen extends KitchenT{
    @Override
    void getOrder(String food) {
        System.out.println("ottenere l'ordine dal cliente");
        orderName = food;
    }

    @Override
    void serveFood(String food) {
        System.out.println("servire cibo cotto al cliente");
    }

    @Override
    void gettingIngredients(String food) {
        System.out.println("ottenere gli ingredienti dal frigorifero per " + food);
    }
}
