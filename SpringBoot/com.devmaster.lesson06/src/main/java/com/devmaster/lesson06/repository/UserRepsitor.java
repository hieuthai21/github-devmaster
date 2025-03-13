package com.devmaster.lesson06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devmaster.lesson06.enity.User;

@Repository
public interface UserRepsitor extends JpaRepository<User, Long> {
}
