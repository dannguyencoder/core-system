package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Object;
import com.vinhnq21.core.cms.entities.Object;
import com.vinhnq21.core.cms.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("object")
public class ObjectController {

    @Autowired
    ObjectService objectService;

    @GetMapping("/objects")
    public List<Object> getAllObjects() {
        return objectService.getAllObject();
    }

    @GetMapping("/objects/{objectId}")
    public Object getSingleObject(@PathVariable int objectId) {
        return objectService.getSingleObject(objectId);
    }


    @PostMapping("/objects")
    public Object createObject(@RequestBody Object objectData) {
        return objectService.insertObject(objectData);
    }

    @PatchMapping("/objects")
    public Object updateObject(@RequestBody Object objectData) {
        return objectService.updateObject(objectData);
    }

    @DeleteMapping("/objects/{objectId}")
    public Object deleteObject(@PathVariable int objectId) {
        return objectService.deleteObject(objectId);
    }
}
