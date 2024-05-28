package org.example.code_smells.refactoring_techniques.part_1;

public class Hide_Delegate {

    public class Department {
        private String name;
        private Employee manager;

        // Конструктор та інші методи класу...

        public Employee getManager() {
            return manager;
        }

        public String getManagerName(){
            return getManager().getName();
        }
    }

    public class Employee {
        private String name;
        private Department department;

        // Конструктор та інші методи класу...

        public Department getDepartment() {
            return department;

        }

        public String getName() {
            return name;
        }
    }
}
