package com.example.demoapp.repository;

import com.example.demoapp.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
    User findByEmail(String email);
}
