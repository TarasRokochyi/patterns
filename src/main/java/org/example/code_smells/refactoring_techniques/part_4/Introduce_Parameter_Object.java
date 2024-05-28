package org.example.code_smells.refactoring_techniques.part_4;

public class Introduce_Parameter_Object {

    public class User {
        private String name;
        private int age;
        private String email;
        // конструктор, геттери і сеттери
    }
    public class UserManager {
        public void createUser(User user) {
            // створення об’єкту користувача і виконання дій
        }
    }
}
