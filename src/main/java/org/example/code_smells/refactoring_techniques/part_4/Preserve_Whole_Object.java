package org.example.code_smells.refactoring_techniques.part_4;

public class Preserve_Whole_Object {

    public class Person {
        private String name;
        private int age;
        private String address;
        // конструктор, геттери і сеттери
    }
    public class ProcessPerson {
        public void process(Person person) {
            // обробка об'єкта Person
        }
    }
}
