package com.devmaster.lesson02.annotation_service;

import org.springframework.stereotype.Service;

@Service
public class MyGreetingService {
    public String greet() {
        return "<h1>Hello from Greetings</h1>";
    }
}
