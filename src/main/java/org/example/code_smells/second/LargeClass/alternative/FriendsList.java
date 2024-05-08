package org.example.code_smells.second.LargeClass.alternative;

import java.util.ArrayList;
import java.util.List;

public class FriendsList {
    private List<Person> friends;

    public FriendsList(){
        friends = new ArrayList<>();
    }

    public void addFriend(Person person){
        friends.add(person);
    }

    public void removeFriend(Person person){
        friends.remove(person);
    }

    protected void displayFriends(){
        System.out.println("Friends: ");
        for (Person person : friends){
            System.out.println("    " + person.getName());
        }
    }
}
