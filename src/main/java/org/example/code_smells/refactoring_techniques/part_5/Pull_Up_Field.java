package org.example.code_smells.refactoring_techniques.part_5;

public class Pull_Up_Field {

    class Vehicle {
        // Поле, яке повторюється в підкласах
        protected String color;
        public Vehicle(String color) {
            this.color = color;
        }
    }
    class Car extends Vehicle {
        // Додаткові поля для підкласу Car
        private String model;
        public Car(String color, String model) {
            super(color);
            this.model = model;
        }
    }

    class Truck extends Vehicle {
        // Додаткові поля для підкласу Truck
        private int loadCapacity;
        public Truck(String color, int loadCapacity) {
            super(color);
            this.loadCapacity = loadCapacity;
        }
    }
}
