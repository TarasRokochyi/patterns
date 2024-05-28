package org.example.code_smells.refactoring_techniques.part_2;

public class Change_Value_to_Reference {

    public class Currency {
        private String code;

        // Конструктор та інші методи класу...

        public Currency(String code) {
            this.code = code;
        }
        public String getCode() {
            return code;
        }

        // Інші методи класу...
    }
    public class Product {
        private String name;
        private double price;
        private Currency currency;

        // Конструктор та інші методи класу...

        public Product(String name, double price, Currency currencyCode) {
            this.name = name;
            this.price = price;
            this.currency = currencyCode; // Кожний продукт має свій екземпляр валюти
        }
        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }
        public String getCurrencyCode() {
            return currency.getCode();
        }
        // Інші методи класу...
    }
}
