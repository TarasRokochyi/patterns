package org.example.behavioral.template_method;

public class IndianKitchen extends KitchenT {

    @Override
    void getOrder(String food) {
        System.out.println("ग्राहक से ऑर्डर प्राप्त करना");
        orderName = food;
    }

    @Override
    void serveFood(String food) {
        System.out.println("ग्राहक के लिए पका हुआ भोजन परोसना");
    }

    @Override
    void gettingIngredients(String food) {
        System.out.println("फ्रिज से सामग्री प्राप्त करना " + food);
    }
}
