package org.example.code_smells.second.LargeClass;

public abstract class Manageable implements GetableRelations, GetableTasks{

    protected void displayEnemies(){
        System.out.println("Enemies: ");
        for (Person person : getEnemiesList()){
            System.out.println("    " + person.getName());
        }
    }

    protected void displayFriends(){
        System.out.println("Friends: ");
        for (Person person : getFriendsList()){
            System.out.println("    " + person.getName());
        }
    }

    protected void displayTasks(){
        System.out.println("Tasks: ");
        for (Task task : getTasksList()){
            System.out.println("    " + task.getDescription().substring(0, 10) + "...   tag: " + task.getTag());
        }
    }

    public void addEnemy(Person person){
        getEnemiesList().add(person);
    }

    public void removeEnemy(Person person){
        getEnemiesList().add(person);
    }

    public void addFriend(Person person){
        getFriendsList().add(person);
    }

    public void removeFriend(Person person){
        getFriendsList().remove(person);
    }


    public void addTask(Task task) {
        getTasksList().add(task);
    }

    public void removeTask(String task){
        getTasksList().remove(task);
    }
}
