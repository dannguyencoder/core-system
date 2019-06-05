package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("/getAllUsers")
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        return users;
    }

    @RequestMapping("/getSingleUser/")
    public User getSingleUser() {
        User user = new User();
        return user;
    }


    @RequestMapping("/createUser")
    public User createUser() {
        User user = new User();
        return user;
    }

    @RequestMapping("/updateUser")
    public User updateUser() {
        User user = new User();
        return user;
    }

    @RequestMapping("/deleteUser")
    public User deleteUser() {
        User user = new User();
        return user;
    }

    @RequestMapping("/login")
    public User login() {
        User user = new User();
        return user;
    }

    @RequestMapping("/logout")
    public User logout() {
        User user = new User();
        return user;
    }
}
