package org.example.code_smells.second.LargeClass;

public class Task {
    private String description;
    private String tag;

    public Task(String description, String tag){
        this.description = description;
        this.tag = tag;
    }


    public String getDescription() {
        return description;
    }

    public String getTag() {
        return tag;
    }
}
