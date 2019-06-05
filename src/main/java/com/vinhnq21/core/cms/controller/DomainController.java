package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Domain;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("domain")
public class DomainController {

    @GetMapping("/getAllDomains")
    public List<Domain> getAllDomains() {
        List<Domain> domains = new ArrayList<>();
        return domains;
    }

    @GetMapping("/getSingleDomain/")
    public Domain getSingleDomain() {
        Domain domain = new Domain();
        return domain;
    }


    @PostMapping("/createDomain")
    public Domain createDomain() {
        Domain domain = new Domain();
        return domain;
    }

    @PatchMapping("/updateDomain")
    public Domain updateDomain() {
        Domain domain = new Domain();
        return domain;
    }

    @DeleteMapping("/deleteDomain")
    public Domain deleteDomain() {
        Domain domain = new Domain();
        return domain;
    }
}
