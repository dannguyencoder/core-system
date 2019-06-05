package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Object;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("object")
public class ObjectController {

    @RequestMapping("/getAllObjects")
    public List<Object> getAllObjects() {
        List<Object> objects = new ArrayList<>();
        return objects;
    }

    @RequestMapping("/getSingleObject/")
    public Object getSingleObject() {
        Object object = new Object();
        return object;
    }


    @RequestMapping("/createObject")
    public Object createObject() {
        Object object = new Object();
        return object;
    }

    @RequestMapping("/updateObject")
    public Object updateObject() {
        Object object = new Object();
        return object;
    }

    @RequestMapping("/deleteObject")
    public Object deleteObject() {
        Object object = new Object();
        return object;
    }
}
