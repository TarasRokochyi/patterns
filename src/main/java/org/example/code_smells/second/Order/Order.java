package org.example.code_smells.second.Order;

import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;
    private double totalPrice;
    public Order(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }
    public void processOrder() {
        // Багато коду для обробки замовлення
        // Цей метод став дуже довгим і складним для розуміння
    }
    private double calculateTotalPrice() {
        double price = 0.0;
        for (Item item : items) {
            price += item.getCount() * item.getPrice();
        }
        return price;
    }
    // Багато інших методів, які опрацьовують замовлення
}
