package com.example.lamgarr.demomysql.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.lamgarr.demomysql.services.UserService;

public class UserController {
    @Autowired
    private UserService userService;
}
