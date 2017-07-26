package demo.controller;

import java.util.List;

public class UserProfile {

    private String username;

    private List<String> roles;

    public UserProfile(String username) {
        this.username = username;
    }

    public UserProfile() {
    }

    public String getUsername() {
        return username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
