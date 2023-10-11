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

    @PostMapping("/save-user")
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

    /* @GetMapping("/user/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    } */

    /* @GetMapping("/get-user-name/{id}")
    public String getNameOfUser(@PathVariable int id) {
        return userService.getNameOfUser(id);
    } */

    /* @GetMapping("/get-user-email/{id}")
    public String getEmailOfUser(@PathVariable int id) {
        return userService.getEmailOfUser(id);
    } */

    /* @GetMapping("/get-user-birthday/{id}")
    public String getBirthdayOfUser(@PathVariable int id) {
        return userService.getBirthdayOfUser(id);
    } */

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

    @DeleteMapping("/delete-all/{name}")
    public void deleteAllUsersByName(@PathVariable String name) {
        //userService.deleteAllUsersByName(name);
        return;
    }
}
