package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository repository;
    
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<User> all() {
        return repository.findAll();
    }

    @PostMapping
    User newUser(@RequestBody User user) {
        return repository.save(user);
    }
}
