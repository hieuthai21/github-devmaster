package com.devmaster.lesson06.controller;

import com.devmaster.lesson06.enity.User;
import com.devmaster.lesson06.repository.UserRepsitor;
import com.devmaster.lesson06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAll() {
        return userService.getAllusers();
    }
    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return userService.createUser(user);
    }
    @PutMapping("/update/{id}")
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
