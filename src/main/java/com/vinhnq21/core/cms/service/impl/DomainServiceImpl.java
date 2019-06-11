package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.entities.Domain;
import com.vinhnq21.core.cms.repository.DomainRepository;
import com.vinhnq21.core.cms.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomainServiceImpl implements DomainService {

    @Autowired
    DomainRepository domainRepository;

    @Override
    public List<Domain> getAllDomain() {
        return domainRepository.findAll();
    }

    @Override
    public Domain getSingleDomain(int domainId) {
        Optional<Domain> optionalDomain = domainRepository.findById(domainId);
        if (!optionalDomain.isPresent()) {
            throw new RuntimeException("Domain not found");
        } else {
            return optionalDomain.get();
        }
    }

    @Override
    public Domain insertDomain(Domain domainData) {

        domainData.setId(0);

        domainRepository.save(domainData);

        return domainData;
    }

    @Override
    public Domain updateDomain(Domain newDomainDataWithId) {

        Optional<Domain> optionalDomain = domainRepository.findById(newDomainDataWithId.getId());

        if (!optionalDomain.isPresent()) {
            throw new RuntimeException("Domain not found");
        } else {
            domainRepository.save(newDomainDataWithId);
        }

        return newDomainDataWithId;
    }

    @Override
    public Domain deleteDomain(int domainId) {

        Optional<Domain> optionalDomain = domainRepository.findById(domainId);

        if (!optionalDomain.isPresent()) {
            throw new RuntimeException("Domain not found");
        } else {
            domainRepository.deleteById(domainId);
        }

        return optionalDomain.get();
    }

}
