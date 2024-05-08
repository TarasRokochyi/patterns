package org.example.code_smells.second.LargeClass;

import java.util.ArrayList;
import java.util.List;

public class Person extends Manageable {
    private String name;
    private int age;
    private String gender;
    private List<Person> friends;
    private List<Person> enemies;
    private List<Task> tasks;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friends = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void displayInfo(){
        System.out.println(this);
        displayEnemies();
        displayFriends();
        displayTasks();
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
    public List<Person> getEnemiesList() {
        return this.enemies;
    }

    @Override
    public List<Person> getFriendsList() {
        return this.friends;
    }

    @Override
    public List<Task> getTasksList() {
        return this.tasks;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender;
    }
}
