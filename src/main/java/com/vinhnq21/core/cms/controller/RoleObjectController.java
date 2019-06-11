package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.RoleObject;
import com.vinhnq21.core.cms.entities.RoleObject;
import com.vinhnq21.core.cms.service.RoleObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("roleObject")
public class RoleObjectController {

    @Autowired
    RoleObjectService roleObjectService;

    @GetMapping("/roleObjects")
    public List<RoleObject> getAllRoleObjects() {
        return roleObjectService.getAllRoleObject();
    }

    @GetMapping("/roleObjects/{roleObjectId}")
    public RoleObject getSingleRoleObject(@PathVariable int roleObjectId) {
        return roleObjectService.getSingleRoleObject(roleObjectId);
    }


    @PostMapping("/roleObjects")
    public RoleObject createRoleObject(@RequestBody RoleObject roleObjectData) {
        return roleObjectService.insertRoleObject(roleObjectData);
    }

    @PatchMapping("/roleObjects")
    public RoleObject updateRoleObject(@RequestBody RoleObject roleObjectData) {
        return roleObjectService.updateRoleObject(roleObjectData);
    }

    @DeleteMapping("/roleObjects/{roleObjectId}")
    public RoleObject deleteRoleObject(@PathVariable int roleObjectId) {
        return roleObjectService.deleteRoleObject(roleObjectId);
    }
}
