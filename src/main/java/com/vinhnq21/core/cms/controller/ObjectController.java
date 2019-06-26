package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.dto.ObjectDTO;
import com.vinhnq21.core.cms.entities.Object;
import com.vinhnq21.core.cms.entities.Object;
import com.vinhnq21.core.cms.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("objects")
public class ObjectController {

    @Autowired
    ObjectService objectService;

    @GetMapping
    public List<ObjectDTO> getAllObjects() {
        return objectService.getAllObject();
    }

    @GetMapping("/{objectId}")
    public Object getSingleObject(@PathVariable int objectId) {
        return objectService.getSingleObject(objectId);
    }


    @PostMapping
    public Object createObject(@RequestBody Object objectData) {
        return objectService.insertObject(objectData);
    }

    @PatchMapping
    public Object updateObject(@RequestBody Object objectData) {
        return objectService.updateObject(objectData);
    }

    @DeleteMapping("/{objectId}")
    public Object deleteObject(@PathVariable int objectId) {
        return objectService.deleteObject(objectId);
    }
}
