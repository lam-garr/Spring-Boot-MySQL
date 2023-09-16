package com.example.lamgarr.demomysql.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.lamgarr.demomysql.repository.UserRepository;

public class UserService {
    @Autowired
    private UserRepository userRepository;
}
