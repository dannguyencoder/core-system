package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.dto.LanguageDTO;
import com.vinhnq21.core.cms.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {

//    LanguageDTO(int id, String name, String code, int domainId, String domainName, byte isActive, byte isVisible, Date createdAt, Date updatedAt)
//    LanguageDTO(int l.id, String l.name, String l.code, int l.domainId, String d.name, byte l.isActive, byte l.isVisible, Timestamp l.createdAt, Timestamp l.updatedAt)
    @Query("SELECT NEW com.vinhnq21.core.cms.dto.LanguageDTO(l.id, l.name, l.code, l.domainId, d.name, l.isActive, l.isVisible, l.createdAt, l.updatedAt) " +
            "FROM Language l " +
            "INNER JOIN Domain d ON l.domainId = d.id")
    public List<LanguageDTO> getLanguages();

}
