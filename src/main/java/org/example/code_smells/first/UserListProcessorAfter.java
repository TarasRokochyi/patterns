package org.example.code_smells.first;
import java.util.ArrayList;
import java.util.Collections;

public class UserListProcessorAfter {
    private ArrayList<User> users;
    public UserListProcessorAfter(ArrayList<User> users) {
        this.users = users;
    }

    public void sort(){
        Collections.sort(users);
    }

    public void processUserList() {
        // Long method
        for (int i = 0; i < users.size(); i++) {
            processUser(users.get(i));
        }
    }

    public void processUser(User user){
        String username = user.getUsername();
        System.out.println("Processing user: " + username);

        // Some processing logic...
        if (user.isAdmin()) {
            System.out.println("Admin user detected!");
        }
    }

    public int countAdminUsers() {
        // Primitive obsession
        int adminCount = 0;
        for (User user : users) {
            if (user.isAdmin()) {
                adminCount++;
            }
        }
        return adminCount;
    }

    // Long parameter list
    public void addUser(User user) {
        // Adding user...
        getUsers().add(user);
    }

    public ArrayList<User> getUsers(){
        return users;
    }
}
