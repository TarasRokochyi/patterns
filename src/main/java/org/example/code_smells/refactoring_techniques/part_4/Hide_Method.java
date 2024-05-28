package org.example.code_smells.refactoring_techniques.part_4;

public class Hide_Method {

    public class Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void getReadyToWork(){
            turnOnAComputer();
        }

        private void turnOnAComputer(){
            System.out.println("turning on a computer");
        }
    }
}
