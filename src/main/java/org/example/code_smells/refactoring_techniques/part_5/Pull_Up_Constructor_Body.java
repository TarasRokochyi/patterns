package org.example.code_smells.refactoring_techniques.part_5;

public class Pull_Up_Constructor_Body {
    class Animal {
        String name;
        int age;
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    class Dog extends Animal {
        String breed;
        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }
    }
    class Cat extends Animal {
        String color;
        public Cat(String name, int age, String color) {
            super(name, age);
            this.color = color;
        }
    }
}
