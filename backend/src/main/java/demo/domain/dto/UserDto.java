package demo.domain.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    private String name;
    private List<String> roles;

    public UserDto() {
        roles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addRole(String role) {
        return roles.add(role);
    }

    public List<String> getRoles() {
        return roles;
    }
}