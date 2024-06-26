package org.example.code_smells.second.Order;

import java.util.List;

public class OrderBefore {
    private String customerName;
    private List<String> items;
    private double totalPrice;
    public OrderBefore(String customerName, List<String> items) {
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
        for (String item : items) {
            // Логіка для розрахунку ціни кожного товару
            // Додати до загальної ціни
        }
        return price;
    }
    // Багато інших методів, які опрацьовують замовлення
}
