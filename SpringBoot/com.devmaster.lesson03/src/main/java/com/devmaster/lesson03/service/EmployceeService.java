package com.devmaster.lesson03.service;

import com.devmaster.lesson03.entity.Employcee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployceeService {
    List<Employcee> employcees = new ArrayList<Employcee>();
    public EmployceeService() {
        employcees.addAll(
                Arrays.asList(
                new Employcee(1L,"Thái Trung Hiếu","Nam",22,10000000L),
                new Employcee(2L,"Nguyễn Đình Bách","Nam",22,12000000L)
            )
        );
    }
    public List<Employcee> getEmploycees() {
        return employcees;
    }
    public Employcee getEmploycee(long id) {
        return employcees.stream().filter(employcee -> employcee.getId() == id).findFirst().orElse(null);
    }
    public Employcee addEmploycee(Employcee employcee) {
        employcees.add(employcee);
        return employcee;
    }
    public Employcee updateEmploycee(long id,Employcee employcee) {
        Employcee check = getEmploycee(id);
        if (check == null) {
            return null;
        }
        employcees.forEach(item->{
            if(item.getId()== id){
                item.setFullname(employcee.getFullname());
                item.setGender(employcee.getGender());
                item.setAge(employcee.getAge());
                item.setSalary(employcee.getSalary());
            }
                });
        return employcee;
    }
    public boolean deleteEmploycee(long id) {
        Employcee employcee = getEmploycee(id);
        return employcees.remove(employcee);
    }
    
}

