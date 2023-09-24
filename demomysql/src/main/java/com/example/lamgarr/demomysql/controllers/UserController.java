package com.example.lamgarr.demomysql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lamgarr.demomysql.models.User;
import com.example.lamgarr.demomysql.services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/save-users")
    public List<User> saveUsers(@RequestBody List<User> users) {
        return userService.saveUsers(users);
    }
}
