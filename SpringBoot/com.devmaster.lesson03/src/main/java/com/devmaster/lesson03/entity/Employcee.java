package com.devmaster.lesson03.entity;

public class Employcee {
    long id;
    String fullname;
    String gender;
    int age;
    long salary;
    public Employcee(){

    }
    public Employcee(long id, String fullname, String gender, int age, long salary) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
