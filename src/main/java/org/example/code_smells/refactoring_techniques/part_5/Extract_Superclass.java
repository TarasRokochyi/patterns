package org.example.code_smells.refactoring_techniques.part_5;

public class Extract_Superclass {

    public class Person{

        protected String name;
        protected double salary;

        protected Person(String name, double salary){
            this.name = name;
            this.salary = salary;
        }

        public void dispayDetails(){
            System.out.println("Name: " + name);
            System.out.println("Salary: $" + salary);
        }

    }

    class Employee extends Person {
        public Employee(String name, double salary) {
            super(name, salary);
        }
        public void displayDetails() {
            super.dispayDetails();
        }
    }
    class Manager extends Person{
        private String department;
        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        public void displayDetails() {
            super.dispayDetails();
            System.out.println("Department: " + department);
        }
    }
}
