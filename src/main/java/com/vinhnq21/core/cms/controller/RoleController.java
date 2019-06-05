package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @RequestMapping("/getAllRoles")
    public List<Role> getAllRoles() {
        List<Role> roles = new ArrayList<>();
        return roles;
    }

    @RequestMapping("/getSingleRole/")
    public Role getSingleRole() {
        Role role = new Role();
        return role;
    }


    @RequestMapping("/createRole")
    public Role createRole() {
        Role role = new Role();
        return role;
    }

    @RequestMapping("/updateRole")
    public Role updateRole() {
        Role role = new Role();
        return role;
    }

    @RequestMapping("/deleteRole")
    public Role deleteRole() {
        Role role = new Role();
        return role;
    }
}
