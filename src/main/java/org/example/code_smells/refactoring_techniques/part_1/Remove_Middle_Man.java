package org.example.code_smells.refactoring_techniques.part_1;

public class Remove_Middle_Man {

    public class Department {
        private String name;
        private Employee manager;
        // Конструктор та інші методи класу...
        public String getManagerName() {
            return manager.getName();
        }
    }

    public class Employee {
        private String name;
        private Department department;

        // Конструктор та інші методи класу...

        public Department getDepartment(){
            return department;
        }

        public String getName(){
            return name;
        }
    }

}
