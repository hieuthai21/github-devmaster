package com.devmaster.lesson02.annotation_controller;
import com.devmaster.lesson02.annotation_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public String getUsers() {
        return userService.getUserDetails();
    }
    @PostMapping("/users")
    public String createUser(){
        return "<h1>Create user";
    }
    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id){
        return "<h1>User with ID" + id + "</h1>updated";
    }
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        return "<h1>User with ID" + id + "</h1>deleted";
    }
}
