package com.devmaster.lesson02.annotation_service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserDetails() {
        return "<h1>Get user details</h1>";
    }
}
