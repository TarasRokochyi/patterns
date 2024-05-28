package org.example.code_smells.refactoring_techniques.part_5;

public class Pull_Up_Method {

    class Animal {
        // Суперклас Animal
        public void makeSound() {
            System.out.println("making sound");
        }
    }
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof woof!");
        }
    }
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("meow meow!");
        }
    }
}
