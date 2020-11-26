package com.example.tournament.resources;

import com.example.tournament.resources.IDGenerator;

public class User {

    public User(String username, String email, String password){
        id = idGenerator.generateID();
    }

    public String getId() {
        return id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String id, username, email, password;
    private IDGenerator idGenerator = IDGenerator.getInstance();
}
