package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.RoleObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("roleObject")
public class RoleObjectController {

    @RequestMapping("/getAllRoleObjects")
    public List<RoleObject> getAllRoleObjects() {
        List<RoleObject> roleObjects = new ArrayList<>();
        return roleObjects;
    }

    @RequestMapping("/getSingleRoleObject/")
    public RoleObject getSingleRoleObject() {
        RoleObject roleObject = new RoleObject();
        return roleObject;
    }


    @RequestMapping("/createRoleObject")
    public RoleObject createRoleObject() {
        RoleObject roleObject = new RoleObject();
        return roleObject;
    }

    @RequestMapping("/updateRoleObject")
    public RoleObject updateRoleObject() {
        RoleObject roleObject = new RoleObject();
        return roleObject;
    }

    @RequestMapping("/deleteRoleObject")
    public RoleObject deleteRoleObject() {
        RoleObject roleObject = new RoleObject();
        return roleObject;
    }
}
