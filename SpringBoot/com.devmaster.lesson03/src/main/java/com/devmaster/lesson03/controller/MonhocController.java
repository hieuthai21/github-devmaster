package com.devmaster.lesson03.controller;

import com.devmaster.lesson03.entity.Monhoc;
import com.devmaster.lesson03.service.MonhocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonhocController {
    @Autowired
    private MonhocService monhocService;

    @GetMapping("/monhoc-list")
    public List<Monhoc> getAllMonhocs(){
        return monhocService.getMonhocs();
    }

    @GetMapping("/monhoc/{mamh}")
    public Monhoc getMonhoc(@PathVariable String mamh){
        long mamhMonhoc = Long.parseLong(mamh);
        return monhocService.getMonhoc(mamhMonhoc);
    }

    @PostMapping("/monhoc-add")
    public Monhoc addMonhoc(@RequestBody Monhoc monhoc){
        return monhocService.addMonhoc(monhoc);
    }

    @PutMapping("/monhoc/{id}")
    public Monhoc updateMonhoc(@PathVariable String mamh, @RequestBody Monhoc monhoc){
        Long mamhMonhoc = Long.parseLong(mamh);
        return monhocService.updateMonhoc(mamhMonhoc, monhoc);
    }
    @DeleteMapping("/monhoc/{mamh}")
    public boolean deleteMonhoc(@PathVariable String mamh){
        Long mamhMonhoc = Long.parseLong(mamh);
        return monhocService.deleteMonhoc(mamhMonhoc);
    }
}
