package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.entities.Domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRepository extends JpaRepository<Domain, Integer> {

}
