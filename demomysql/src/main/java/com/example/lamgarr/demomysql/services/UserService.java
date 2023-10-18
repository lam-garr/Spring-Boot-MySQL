package com.example.lamgarr.demomysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.lamgarr.demomysql.models.User;
import com.example.lamgarr.demomysql.repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
        return;
    }

    public void deleteUserByEmail(String email) {
        //
        return;
    }

    /* public int getIdOfUser(int id) {
        return;
    } */

    /* public int getAgeOfUser(int id) {
        return;
    } */

    /* public int getBirthdayOfUser(int id) {
        return;
    } */

    /* public String getEmailOfUser(int id) {
        return;
    } */

    /* public String getNameOfUser(int id) {
        return;
    } */
}
