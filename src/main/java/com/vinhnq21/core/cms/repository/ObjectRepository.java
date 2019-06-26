package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.dto.ObjectDTO;
import com.vinhnq21.core.cms.entities.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjectRepository extends JpaRepository<Object, Integer> {

    @Query("SELECT NEW com.vinhnq21.core.cms.dto.ObjectDTO(o.id, o.objectName, o.url, o.parentId, o.objectOrder, o.domainId, d.name, o.isActive, o.isVisible, o.createdAt, o.updatedAt) " +
            "FROM Object o " +
            "INNER JOIN Domain d ON o.domainId = d.id")
    List<ObjectDTO> getObjects();
}
