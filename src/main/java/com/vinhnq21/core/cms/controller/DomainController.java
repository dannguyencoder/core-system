package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Domain;
import com.vinhnq21.core.cms.entities.Domain;
import com.vinhnq21.core.cms.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("domain")
public class DomainController {

    @Autowired
    DomainService domainService;

    @GetMapping("/domains")
    public List<Domain> getAllDomains() {
        return domainService.getAllDomain();
    }

    @GetMapping("/domains/{domainId}")
    public Domain getSingleDomain(@PathVariable int domainId) {
        return domainService.getSingleDomain(domainId);
    }


    @PostMapping("/domains")
    public Domain createDomain(@RequestBody Domain domainData) {
        return domainService.insertDomain(domainData);
    }

    @PatchMapping("/domains")
    public Domain updateDomain(@RequestBody Domain domainData) {
        return domainService.updateDomain(domainData);
    }

    @DeleteMapping("/domains/{domainId}")
    public Domain deleteDomain(@PathVariable int domainId) {
        return domainService.deleteDomain(domainId);
    }
}
