package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.dto.CategoryDTO;
import com.vinhnq21.core.cms.dto.PostDTO;
import com.vinhnq21.core.cms.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query("SELECT NEW com.vinhnq21.core.cms.dto.PostDTO(p.id, p.title, p.categoryId, c.name, p.userId, u.username, p.languageId, l.name, p.domainId, d.name, " +
            "p.contentId, p.avatarLink, p.postContent, p.metaKeywords, p.metaDescription, p.isActive, p.isVisible, p.createdAt, p.updatedAt) " +
            "FROM Post p " +
            "INNER JOIN Category c ON p.categoryId = c.id " +
            "INNER JOIN User u ON p.userId = u.id " +
            "INNER JOIN Language l ON p.languageId = l.id " +
            "INNER JOIN Domain d ON p.domainId = d.id "
    )
    public List<PostDTO> getPosts();

}
