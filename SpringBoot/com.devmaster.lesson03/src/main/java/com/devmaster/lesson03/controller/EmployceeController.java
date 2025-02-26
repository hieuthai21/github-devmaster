package com.devmaster.lesson03.controller;

import com.devmaster.lesson03.entity.Employcee;
import com.devmaster.lesson03.service.EmployceeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployceeController {
    @Autowired
    private EmployceeService employceeService;

    @GetMapping("/employcee-list")
    public List<Employcee> getAllEmploycees(){
        return employceeService.getEmploycees();
    }

    @GetMapping("/employcee/{id}")
    public Employcee getEmploycee(@PathVariable String id){
        long idEmploycee = Long.parseLong(id);
        return employceeService.getEmploycee(idEmploycee);
    }

    @PostMapping("/employcee-add")
    public Employcee addEmploycee(@RequestBody Employcee employcee){
        return employceeService.addEmploycee(employcee);
    }

    @PutMapping("/employcee/{id}")
    public Employcee updateEmploycee(@PathVariable String id, @RequestBody Employcee employcee){
        Long idEmploycee = Long.parseLong(id);
        return employceeService.updateEmploycee(idEmploycee, employcee);
    }
    @DeleteMapping("/employcee/{id}")
    public boolean deleteEmploycee(@PathVariable String id){
        Long idEmploycee = Long.parseLong(id);
        return employceeService.deleteEmploycee(idEmploycee);
    }

}
