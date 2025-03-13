package com.devmaster.lesson06.service;

import com.devmaster.lesson06.enity.User;
import com.devmaster.lesson06.repository.UserRepsitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.lang.Long;

@Service
public class UserService {
    @Autowired
    private UserRepsitor userRepsitor;
    // Lấy toàn bộ user
    public List<User> getAllusers() {
        return userRepsitor.findAll();
    }
    public User getUserById(int id) {
        return userRepsitor.findById((long) id).get();
    }
    public User createUser(User user) {
        return userRepsitor.save(user);
    }
    public User updateUser(User user) {
        return userRepsitor.save(user);
    }
    public void deleteUser(User user) {
        userRepsitor.delete(user);
    }
}

