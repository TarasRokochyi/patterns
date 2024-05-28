package org.example.code_smells.refactoring_techniques.part_2;

public class Encapsulate_Field {

    public class Person{
        private String name;

        public Person(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
