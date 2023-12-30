package com.sawickimike.budgetmanagerapp.services;

public class UserService {
    private String username;
    private String password;

    public UserService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Function to validate user credentials
    public boolean validateUser(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    // Getters and setters for username and password (optional based on requirements)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
