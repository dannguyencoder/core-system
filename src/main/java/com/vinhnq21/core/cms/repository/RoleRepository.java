package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.dto.LanguageDTO;
import com.vinhnq21.core.cms.dto.RoleDTO;
import com.vinhnq21.core.cms.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("SELECT NEW com.vinhnq21.core.cms.dto.RoleDTO(r.id, r.name, r.domainId, d.name, r.isActive, r.isVisible, r.createdAt, r.updatedAt) " +
            "FROM Role r " +
            "INNER JOIN Domain d ON r.domainId = d.id")
    public List<RoleDTO> getRoles();

}
