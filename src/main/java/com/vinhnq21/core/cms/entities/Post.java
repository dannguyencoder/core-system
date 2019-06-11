package com.vinhnq21.core.cms.entities;

import javax.persistence.*;

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

    @Column(name = "AVATAR", unique = true, nullable = false)
    private String avatar;

    @Column(name = "LANGUAGE_ID", unique = true, nullable = false)
    private int languageId;

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

    public Post(int id, String title, int categoryId, String avatar, int languageId, String postContent, byte isActive, byte isVisible, String metaKeywords, String metaDescription, int domainId, int contentId) {
        this.id = id;
        this.title = title;
        this.categoryId = categoryId;
        this.avatar = avatar;
        this.languageId = languageId;
        this.postContent = postContent;
        this.isActive = isActive;
        this.isVisible = isVisible;
        this.metaKeywords = metaKeywords;
        this.metaDescription = metaDescription;
        this.domainId = domainId;
        this.contentId = contentId;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public static class Builder {

        private int id;
        private String title;
        private int categoryId;
        private String avatar;
        private int languageId;
        private String postContent;
        private byte isActive;
        private byte isVisible;
        private String metaKeywords;
        private String metaDescription;
        private int domainId;
        private int contentId;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setCategoryId(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public Builder setLanguageId(int languageId) {
            this.languageId = languageId;
            return this;
        }

        public Builder setPostContent(String postContent) {
            this.postContent = postContent;
            return this;
        }

        public Builder setIsActive(byte isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setIsVisible(byte isVisible) {
            this.isVisible = isVisible;
            return this;
        }

        public Builder setMetaKeywords(String metaKeywords) {
            this.metaKeywords = metaKeywords;
            return this;
        }

        public Builder setMetaDescription(String metaDescription) {
            this.metaDescription = metaDescription;
            return this;
        }

        public Builder setDomainId(int domainId) {
            this.domainId = domainId;
            return this;
        }

        public Builder setContentId(int contentId) {
            this.contentId = contentId;
            return this;
        }

        public Post createPost() {
            return new Post(id, title, categoryId, avatar, languageId, postContent, isActive, isVisible, metaKeywords, metaDescription, domainId, contentId);
        }
    }
}
