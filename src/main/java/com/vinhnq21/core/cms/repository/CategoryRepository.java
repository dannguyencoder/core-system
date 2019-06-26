package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.dto.CategoryDTO;
import com.vinhnq21.core.cms.dto.UserDTO;
import com.vinhnq21.core.cms.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("SELECT NEW com.vinhnq21.core.cms.dto.CategoryDTO(c.id, c.parentId, c.name, c.friendlyUrl, c.categoryOrder, c.metaKeywords, " +
            "c.metaDescription, c.template, c.userId, u.username, c.languageId, l.name, c.domainId, d.name, c.isActive, c.isVisible, c.createdAt, c.updatedAt) " +
            "FROM Category c " +
            "INNER JOIN User u ON c.userId = u.id " +
            "INNER JOIN Language l ON c.languageId = l.id " +
            "INNER JOIN Domain d ON c.domainId = d.id "
    )
    public List<CategoryDTO> getCategories();

}
