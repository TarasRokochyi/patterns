package org.example.code_smells.refactoring_techniques.part_1;

public class Extract_Class {

    public class Employee {
        private String name;
        private String department;
        private double salary;

        // Конструктор та інші методи класу...
        // Інші методи класу...

        public void printEmployeeDetails() {
            EmployeePrinter.printEmployeeDetails(this);
        }

        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }

        public String getName() {
            return name;
        }
    }

    public class EmployeePrinter {

        public static void printEmployeeDetails(Employee employee) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.getSalary());
        }
    }

}
