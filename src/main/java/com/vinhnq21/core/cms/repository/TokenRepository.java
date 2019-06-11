package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, Integer> {

}
