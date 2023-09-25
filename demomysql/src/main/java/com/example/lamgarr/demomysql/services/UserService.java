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

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }
}
