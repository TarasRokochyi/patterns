package org.example.code_smells.refactoring_techniques.part_2;

import java.util.List;

public class Replace_Array_with_Object {

    public class CarData {
        private List<Car> cars;
        public CarData(List<Car> cars) {
            this.cars = cars;
        }

        public void addCar(Car car){
            cars.add(car);
        }

        public void removeCar(Car car){
            cars.remove(car);
        }
        // Додаткові методи для роботи з масивом...
    }

    public class Car{
        private String name;
        private int price;
        private int year;
        public Car (String name, int price, int year){
            this.name = name;
            this.price = price;
            this.year = year;
        }
    }
}
