package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.dto.RoleDTO;
import com.vinhnq21.core.cms.entities.Role;
import com.vinhnq21.core.cms.entities.Role;
import com.vinhnq21.core.cms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("roles")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping
    public List<RoleDTO> getAllRoles() {
        return roleService.getAllRole();
    }

    @GetMapping("/{roleId}")
    public Role getSingleRole(@PathVariable int roleId) {
        return roleService.getSingleRole(roleId);
    }


    @PostMapping
    public Role createRole(@RequestBody Role roleData) {
        return roleService.insertRole(roleData);
    }

    @PatchMapping
    public Role updateRole(@RequestBody Role roleData) {
        return roleService.updateRole(roleData);
    }

    @DeleteMapping("/{roleId}")
    public Role deleteRole(@PathVariable int roleId) {
        return roleService.deleteRole(roleId);
    }
}
