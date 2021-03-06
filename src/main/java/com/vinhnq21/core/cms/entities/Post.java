package com.vinhnq21.core.cms.entities;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "TBL_POST"
//        , catalog = "cms",
//        uniqueConstraints = {
//        @UniqueConstraint(columnNames = ""),
//        @UniqueConstraint(columnNames = "")
//}
)
public class Post {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "TITLE", unique = true, nullable = false)
    private String title;

    @Column(name = "CATEGORY_ID", unique = true, nullable = false)
    private int categoryId;

    @Column(name = "AVATAR_LINK", unique = true, nullable = false)
    private String avatarLink;

    @Column(name = "LANGUAGE_ID", unique = true, nullable = false)
    private int languageId;

    @Column(name = "USER_ID", unique = true, nullable = false)
    private int userId;

    @Column(name = "POST_CONTENT", unique = true, nullable = false)
    private String postContent;

    @Column(name = "IS_ACTIVE", unique = true, nullable = false)
    private byte isActive;

    @Column(name = "IS_VISIBLE", unique = true, nullable = false)
    private byte isVisible;

    @Column(name = "META_KEYWORDS", unique = true, nullable = false)
    private String metaKeywords;

    @Column(name = "META_DESCRIPTION", unique = true, nullable = false)
    private String metaDescription;

    @Column(name = "DOMAIN_ID", unique = true, nullable = false)
    private int domainId;

    @Column(name = "CONTENT_ID", unique = true, nullable = false)
    private int contentId;

    @Column(name = "CREATED_AT", unique = true, nullable = false)
    private Date createdAt;

    @Column(name = "UPDATED_AT", unique = true, nullable = false)
    private Date updatedAt;

    public Post(String title, int categoryId, String avatarLink, int languageId, int userId, String postContent, byte isActive, byte isVisible, String metaKeywords, String metaDescription, int domainId, int contentId, Date createdAt, Date updatedAt) {
        this.title = title;
        this.categoryId = categoryId;
        this.avatarLink = avatarLink;
        this.languageId = languageId;
        this.userId = userId;
        this.postContent = postContent;
        this.isActive = isActive;
        this.isVisible = isVisible;
        this.metaKeywords = metaKeywords;
        this.metaDescription = metaDescription;
        this.domainId = domainId;
        this.contentId = contentId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Post() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public byte getIsActive() {
        return isActive;
    }

    public void setIsActive(byte isActive) {
        this.isActive = isActive;
    }

    public byte getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(byte isVisible) {
        this.isVisible = isVisible;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
