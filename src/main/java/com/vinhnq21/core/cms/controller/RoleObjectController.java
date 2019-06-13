package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.RoleObject;
import com.vinhnq21.core.cms.entities.RoleObject;
import com.vinhnq21.core.cms.service.RoleObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("roleObjects")
public class RoleObjectController {

    @Autowired
    RoleObjectService roleObjectService;

    @GetMapping
    public List<RoleObject> getAllRoleObjects() {
        return roleObjectService.getAllRoleObject();
    }

    @GetMapping("/{roleObjectId}")
    public RoleObject getSingleRoleObject(@PathVariable int roleObjectId) {
        return roleObjectService.getSingleRoleObject(roleObjectId);
    }


    @PostMapping
    public RoleObject createRoleObject(@RequestBody RoleObject roleObjectData) {
        return roleObjectService.insertRoleObject(roleObjectData);
    }

    @PatchMapping
    public RoleObject updateRoleObject(@RequestBody RoleObject roleObjectData) {
        return roleObjectService.updateRoleObject(roleObjectData);
    }

    @DeleteMapping("/{roleObjectId}")
    public RoleObject deleteRoleObject(@PathVariable int roleObjectId) {
        return roleObjectService.deleteRoleObject(roleObjectId);
    }
}
