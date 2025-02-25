package com.devmaster.lesson02.annotation_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyParamController {
    //Sử dung @RequestParam để lấy query paraeter từ URL
    @GetMapping("/my-param")
    public String searchUser(@RequestParam(value = "name", required = false) String name){
        if(name == null){
            return "<h1>No name provided, returning all users</h1>";
        }
        return "<h1>Searching for user with name: " + name + "</h1>";
    }

    //Sử dung @PathVariable để lấy giá trị từ đường dẫn URl
    @GetMapping("/my-variable/{id}")
    public String getUserById(@PathVariable(required = false) String id ){
        return "<h1>User ID is: " + id + "</h1>";
    }
}
