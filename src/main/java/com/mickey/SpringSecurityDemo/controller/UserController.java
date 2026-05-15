package com.mickey.SpringSecurityDemo.controller;

import com.mickey.SpringSecurityDemo.model.User;
import com.mickey.SpringSecurityDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(service.getUsers());
    }

    @PostMapping("/users/register")
    public ResponseEntity<?> addUser(@RequestBody User user){
        return ResponseEntity.ok(service.addUser(user));
    }

}
