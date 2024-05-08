package org.example.code_smells.first;

public class Email {
    private User receiver;
    private String text;

    public Email(User sender, User receiver, String text){
        this.receiver = receiver;
        this.text = text;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
