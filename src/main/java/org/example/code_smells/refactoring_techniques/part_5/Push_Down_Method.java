package org.example.code_smells.refactoring_techniques.part_5;

public class Push_Down_Method {

    class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    class Dog extends Animal {
        // Метод makeSound не використовується в класі Dog
    }
    class Cat extends Animal {
        void makeSound() {
            System.out.println("Meow");
        }
    }
}
