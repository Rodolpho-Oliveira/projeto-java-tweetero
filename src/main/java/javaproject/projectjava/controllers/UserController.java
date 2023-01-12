package javaproject.projectjava.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class UserController {

    SignUpForm obj = new SignUpForm();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void signUp(@RequestBody Object user) {
        obj.setUser(user);        
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Object getUsers() {
        return obj.getUser();
    }
}
