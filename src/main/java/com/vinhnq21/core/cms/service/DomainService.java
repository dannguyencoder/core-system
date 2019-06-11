package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.entities.Domain;

import java.util.List;


public interface DomainService {

    List<Domain> getAllDomain();

    Domain getSingleDomain(int domainId);

    Domain insertDomain(Domain domainData);

    Domain updateDomain(Domain newDomainDataWithId);

    Domain deleteDomain(int domainId);

}
