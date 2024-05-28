package org.example.code_smells.refactoring_techniques.part_2;

import java.util.List;

public class Change_Bidirectional_Association_to_Unidirectional {

    public class Department {
        private String name;
        private List<Employee> employees;
        public Department(String name, List<Employee> employees) {
            this.name = name;
            this.employees = employees;
        }
        // Додаткові методи...
    }

    public class Employee {
        private String name;
        public Employee(String name) {
            this.name = name;
        }
        // Додаткові методи...
    }
}
