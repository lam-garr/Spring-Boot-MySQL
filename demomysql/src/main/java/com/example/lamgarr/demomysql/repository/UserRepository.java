package com.example.lamgarr.demomysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lamgarr.demomysql.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findByName(String name);
}
