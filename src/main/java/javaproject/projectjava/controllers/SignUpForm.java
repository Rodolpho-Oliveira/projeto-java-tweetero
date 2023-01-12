package javaproject.projectjava.controllers;

import java.util.ArrayList;
import java.util.List;

public class SignUpForm {
    public List<Object> users = new ArrayList<>();

    public List<Object> getUser() {
        return users;
    }

    public void setUser(Object user) {
        this.users.add(user);
    }
}
