package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.domain.LanguageDomain;
import com.vinhnq21.core.cms.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {

    @Query("SELECT l.id, l.name, l.code, d.name, l.isActive, l.isVisible, l.createdAt, l.updatedAt " +
            "FROM Language l " +
            "INNER JOIN Domain d ON l.domainId = d.id")
    public List<LanguageDomain> getLanguages();

}
