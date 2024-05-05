package com.auth1.auth.learn.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

public class User extends BaseModal{

    private String name;
    private String email;
    private String password;
    @ManyToMany
    private List<Role> roles;
    private boolean isEmailVerified;

    public User(){

    }
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = new ArrayList<>();
        this.isEmailVerified = false;
    }
}
