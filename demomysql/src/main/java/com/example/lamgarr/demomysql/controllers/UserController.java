package com.example.lamgarr.demomysql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/user/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }

    @PostMapping("/update")
    public void updateUser(@RequestBody User user) {
        //userService.updateUser(user);
        return;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUserById(id);
        return;
    }
}
