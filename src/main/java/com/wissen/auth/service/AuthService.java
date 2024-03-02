package com.wissen.auth.service;

import com.wissen.auth.entity.User;
import com.wissen.auth.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class AuthService {

    @Autowired
    private AuthRepository repository;


    public String addUser(User user){
        try {
            user.setUserId(UUID.randomUUID().toString().split("-")[0]);
            user.setCreatedAt(LocalDateTime.now());
            user.setUpdatedAt(LocalDateTime.now());
            user.setLastLoginAt(LocalDateTime.now());
            repository.save(user);
            return "User Added Successfully...";
        }catch (Exception err){
            err.printStackTrace();
            return "Failed to add User: " + err.getMessage();
        }
    }

    public List<User> getAllUser(){
        return repository.findAll();
    }

}
