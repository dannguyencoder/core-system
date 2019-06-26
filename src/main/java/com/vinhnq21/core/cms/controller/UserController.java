package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.dto.TokenDTO;
import com.vinhnq21.core.cms.dto.UserDTO;
import com.vinhnq21.core.cms.entities.User;
import com.vinhnq21.core.cms.entities.User;
import com.vinhnq21.core.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/{userId}")
    public User getSingleUser(@PathVariable int userId) {
        return userService.getSingleUser(userId);
    }


    @PostMapping
    public User createUser(@RequestBody User userData) {
        return userService.insertUser(userData);
    }

    @PatchMapping
    public User updateUser(@RequestBody User userData) {
        return userService.updateUser(userData);
    }

    @DeleteMapping("/{userId}")
    public User deleteUser(@PathVariable int userId) {
        return userService.deleteUser(userId);
    }

    @PostMapping("/login")
    public TokenDTO login() {
        return new TokenDTO("sample token");
    }
}
