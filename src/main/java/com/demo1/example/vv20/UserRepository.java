package com.demo1.example.vv20;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo1.example.vv20.User;

public interface UserRepository extends JpaRepository<User, Long> {
}