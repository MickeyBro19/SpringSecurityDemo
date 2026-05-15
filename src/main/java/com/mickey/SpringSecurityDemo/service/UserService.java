package com.mickey.SpringSecurityDemo.service;

import com.mickey.SpringSecurityDemo.model.User;
import com.mickey.SpringSecurityDemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    private final BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public List<User> getUsers(){
        return repo.findAll();
    }

    public User addUser(User student){
        student.setPassword(encoder.encode(student.getPassword()));
        return repo.save(student);

    }

}
