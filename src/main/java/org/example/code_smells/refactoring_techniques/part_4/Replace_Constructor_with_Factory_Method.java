package org.example.code_smells.refactoring_techniques.part_4;

class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    private Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        registerCar();
    }

    private void registerCar() {
        System.out.println("Car registered successfully!");
    }

    public static Car createCar(String brand, String model, int year, String color) {
        Car car = new Car(brand, model, year, color);
        return car;
    }

// Інші методи класу
}
