package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.User;
import com.vinhnq21.core.cms.entities.User;
import com.vinhnq21.core.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/users/{userId}")
    public User getSingleUser(@PathVariable int userId) {
        return userService.getSingleUser(userId);
    }


    @PostMapping("/users")
    public User createUser(@RequestBody User userData) {
        return userService.insertUser(userData);
    }

    @PatchMapping("/users")
    public User updateUser(@RequestBody User userData) {
        return userService.updateUser(userData);
    }

    @DeleteMapping("/users/{userId}")
    public User deleteUser(@PathVariable int userId) {
        return userService.deleteUser(userId);
    }
}
