package com.demo1.example.vv20;



import com.demo1.example.vv20.User;
import com.demo1.example.vv20.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}