package org.example.code_smells.refactoring_techniques.part_5;

public class Collapse_Hierarchy {

    class Dog {
        private String species;
        public Dog(String species) {
            this.species = species;
        }
        public void eat() {
            System.out.println("The animal is eating.");
        }
        public void sleep() {
            System.out.println("The animal is sleeping.");
        }
        public void bark() {
            System.out.println("The dog is barking.");
        }
    }
}
