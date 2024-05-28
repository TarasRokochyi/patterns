package org.example.code_smells.refactoring_techniques.part_5;

public class Push_Down_Field {

    class Vehicle {
        protected String model;
    }
    class Car extends Vehicle {
        // Клас Car використовує лише поле model, а поле brand не використовується
    }
    class Truck extends Vehicle {
        // Клас Truck використовує лише поле model, а поле brand не використовується
    }
}
