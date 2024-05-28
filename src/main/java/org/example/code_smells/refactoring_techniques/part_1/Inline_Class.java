package org.example.code_smells.refactoring_techniques.part_1;

public class Inline_Class {

    public class Person {
        private String name;
        private String street;
        private String city;
        private String country;

        // Конструктор, геттери та сеттери...
        public Person(String name, String street, String city, String country){
            this.name = name;
            this.street = street;
            this.city = city;
            this.country = country;
        }

        public void printAddress() {
            System.out.println("Address: " + getStreet() + ", " + getCity() + ", " + getCountry());
        }

        public String getCountry() {
            return country;
        }

        public String getCity() {
            return city;
        }

        public String getName() {
            return name;
        }

        public String getStreet() {
            return street;
        }
    }
}
