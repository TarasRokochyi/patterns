package org.example.code_smells.refactoring_techniques.part_2;

public class Duplicate_Observed_Data {

    public class Order {
        private String customerName;
        private String productName;
        private int quantity;
        // Конструктор, геттери і сеттери, інші методи класу...
    }

    public class OrderManager{
        public Order order;

        public OrderManager(Order order){
            this.order = order;
        }
        // Конструктор, геттери і сеттери, інші методи класу...
    }
}
