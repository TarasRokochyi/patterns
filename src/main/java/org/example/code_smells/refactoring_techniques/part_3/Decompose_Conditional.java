package org.example.code_smells.refactoring_techniques.part_3;

public class Decompose_Conditional {
    class User{
        public boolean isLoggedIn(){
            return false;
        }

        public boolean hasPermission(Resource resource){
            return true;
        }
    }
    class Resource{}

    public void checkAccess(User user, Resource resource) {
        if (user != null && user.isLoggedIn() && resource != null) {
            checkPermission(user, resource);
        } else {
            // Доступ заборонено
            System.out.println("Access denied");

        }
    }
    public void checkPermission(User user,Resource resource){
        if (user.hasPermission(resource)) {
            // Доступ дозволено
            System.out.println("Access granted");
        } else {
            // Доступ заборонено
            System.out.println("Access denied");
        }
    }
}
