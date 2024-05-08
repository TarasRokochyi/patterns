package org.example.code_smells.second.LargeClass.alternative;

import org.example.code_smells.second.LargeClass.Manageable;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String gender;
    private EnemiesList enemies;
    private FriendsList friends;
    private TasksList tasks;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.enemies = new EnemiesList();
        this.friends = new FriendsList();
        this.tasks = new TasksList();
    }

    public void displayInfo(){
        System.out.println(this);
        enemies.displayEnemies();
        friends.displayFriends();
        tasks.displayTasks();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender;
    }
}
