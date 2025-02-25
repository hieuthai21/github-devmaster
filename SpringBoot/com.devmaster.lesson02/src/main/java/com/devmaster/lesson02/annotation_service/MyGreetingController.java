package com.devmaster.lesson02.annotation_service;

import com.devmaster.lesson02.IoC_spring.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyGreetingController {
    @Autowired
    private final MyGreetingService mygreetingService;
    public MyGreetingController(MyGreetingService greetingService) {
        this.mygreetingService = greetingService;
    }

    @GetMapping("/my-greet")
    public String greet() {
        return mygreetingService.greet();
    }
}
