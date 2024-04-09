package org.example.behavioral.template_method;

public abstract class KitchenT {
    public String orderName;

    public void prepareFood(String food){
        getOrder(food);
        gettingIngredients(food);
        serveFood(food);
    }

    abstract void getOrder(String food);

    abstract void serveFood(String food);

    abstract void gettingIngredients(String food);
}
