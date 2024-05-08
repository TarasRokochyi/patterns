package org.example.code_smells.first;

public class User implements Comparable<User>{
    private String username;
    private String email;
    private String password;
    private String address;
    private boolean isAdmin;

    public User(String username, String email, String password, String address, boolean isAdmin){
        setUsername(username);
        setEmail(email);
        setPassword(password);
        setAddress(address);
        setAdmin(isAdmin);
    }

    public void receiveEmail(User sender, Email email){
        System.out.println(getUsername() + " has received an email with text: \n" + email.getText() + "\nFrom: " + sender.getUsername());
    }

    public void sendEmail(Email email){
        User receiver = email.getReceiver();
        receiver.receiveEmail(this, email);
        System.out.println("The email is send by " + getUsername() + " to " + receiver.getUsername());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAdmin(){
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


    @Override
    public int compareTo(User o) {
        return this.getUsername().compareTo(o.getUsername());
    }
}
