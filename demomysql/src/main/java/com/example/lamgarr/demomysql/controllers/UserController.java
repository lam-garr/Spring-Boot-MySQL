package com.example.lamgarr.demomysql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
}
