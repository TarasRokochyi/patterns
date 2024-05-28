package org.example.code_smells.refactoring_techniques.part_1;

import java.util.List;
import java.util.Map;


public class Move_Field {

    public class Employee {
        private String name;
        private Company company;

        // Конструктор та інші методи класу...
        public double getSalary() {
            return company.getSalary(this);
        }

        public String getName(){
            return name;
        }
    }
    public class Company {
        private List<Employee> employees;
        private Map<Employee, Double> salaries;

        // Конструктор та інші методи класу...

        public void printEmployeeSalaries() {
            for (Employee employee : employees) {
                System.out.println(employee.getName() + ": " + getSalary(employee));
            }
        }

        public double getSalary(Employee employee){
            return salaries.get(employee);
        }
    }

}
