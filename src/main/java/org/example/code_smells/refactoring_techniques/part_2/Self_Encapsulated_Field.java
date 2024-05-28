package org.example.code_smells.refactoring_techniques.part_2;

public class Self_Encapsulated_Field {

    public class Employee {
        private String name;
        private double salary;
        // Конструктор та інші методи класу...
        public void raiseSalary(double amount) {
            if (amount > 0) {
                setSalary(getSalary() + amount);
            }
        }
        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary){
            this.salary = salary;
        }
        // Інші методи класу...
    }

}
