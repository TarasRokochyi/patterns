package org.example.code_smells.second.LargeClass.alternative;

import org.example.code_smells.second.LargeClass.Task;

import java.util.ArrayList;
import java.util.List;

public class TasksList {
    private List<Task> tasks;

    public TasksList(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void removeTask(Task task){
        tasks.remove(task);
    }

    protected void displayTasks(){
        System.out.println("Tasks: ");
        for (Task task : tasks){
            System.out.println("    " + task.getDescription().substring(0, 10) + "...   tag: " + task.getTag());
        }
    }
}
