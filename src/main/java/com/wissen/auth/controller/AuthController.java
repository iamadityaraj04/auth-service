package com.wissen.auth.controller;

import com.wissen.auth.entity.User;
import com.wissen.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping
    public String greet(){
        return "Hello! Welcome to AuthService";
    }
    @GetMapping("/user")
    public List<User> getUser(){
        return authService.getAllUser();
    }
    @PostMapping("/user")
    public String createUser(@RequestBody User user){
        return authService.addUser(user);
    }

}
