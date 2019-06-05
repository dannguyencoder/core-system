package com.vinhnq21.core.cms.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "stock", catalog = "mkyong", uniqueConstraints = {
        @UniqueConstraint(columnNames = ""),
        @UniqueConstraint(columnNames = "") })
public class Category {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "PARENT_ID", unique = true, nullable = false, length = 10)
    private int parentId;

    @Column(name = "NAME", unique = true, nullable = false, length = 10)
    private String name;

    @Column(name = "FRIENDLY_URL", unique = true, nullable = false, length = 10)
    private String friendlyUrl;

    @Column(name = "ORDER", unique = true, nullable = false, length = 10)
    private byte order;

    @Column(name = "IS_VISIBLE", unique = true, nullable = false, length = 10)
    private byte isVisible;

    @Column(name = "IS_ACTIVE", unique = true, nullable = false, length = 10)
    private byte isActive;

    @Column(name = "META_KEYWORDS", unique = true, nullable = false, length = 10)
    private String metaKeywords;

    @Column(name = "META_DESCRIPTION", unique = true, nullable = false, length = 10)
    private String metaDescription;

    @Column(name = "TEMPLATE", unique = true, nullable = false, length = 10)
    private String template;

    @Column(name = "USER_ID", unique = true, nullable = false, length = 10)
    private int userId;

    @Column(name = "LANGUAGE_ID", unique = true, nullable = false, length = 10)
    private int languageId;

    @Column(name = "DOMAIN_ID", unique = true, nullable = false, length = 10)
    private int domainId;

    @Column(name = "CREATED_AT", unique = true, nullable = false, length = 10)
    private Date createdAt;

    @Column(name = "UPDATED_AT", unique = true, nullable = false, length = 10)
    private Date updatedAt;

    public Category(int id, int parentId, String name, String friendlyUrl, byte order, byte isVisible, byte isActive, String metaKeywords, String metaDescription, String template, int userId, int languageId, int domainId, Date createdAt, Date updatedAt) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.friendlyUrl = friendlyUrl;
        this.order = order;
        this.isVisible = isVisible;
        this.isActive = isActive;
        this.metaKeywords = metaKeywords;
        this.metaDescription = metaDescription;
        this.template = template;
        this.userId = userId;
        this.languageId = languageId;
        this.domainId = domainId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Category() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFriendlyUrl() {
        return friendlyUrl;
    }

    public void setFriendlyUrl(String friendlyUrl) {
        this.friendlyUrl = friendlyUrl;
    }

    public byte getOrder() {
        return order;
    }

    public void setOrder(byte order) {
        this.order = order;
    }

    public byte getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(byte isVisible) {
        this.isVisible = isVisible;
    }

    public byte getIsActive() {
        return isActive;
    }

    public void setIsActive(byte isActive) {
        this.isActive = isActive;
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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
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

    public static class Builder {

        private int id;
        private int parentId;
        private String name;
        private String friendlyUrl;
        private byte order;
        private byte isVisible;
        private byte isActive;
        private String metaKeywords;
        private String metaDescription;
        private String template;
        private int userId;
        private int languageId;
        private int domainId;
        private Date createdAt;
        private Date updatedAt;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setParentId(int parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFriendlyUrl(String friendlyUrl) {
            this.friendlyUrl = friendlyUrl;
            return this;
        }

        public Builder setOrder(byte order) {
            this.order = order;
            return this;
        }

        public Builder setIsVisible(byte isVisible) {
            this.isVisible = isVisible;
            return this;
        }

        public Builder setIsActive(byte isActive) {
            this.isActive = isActive;
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

        public Builder setTemplate(String template) {
            this.template = template;
            return this;
        }

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setLanguageId(int languageId) {
            this.languageId = languageId;
            return this;
        }

        public Builder setDomainId(int domainId) {
            this.domainId = domainId;
            return this;
        }

        public Builder setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Category createCategory() {
            return new Category(id, parentId, name, friendlyUrl, order, isVisible, isActive, metaKeywords, metaDescription, template, userId, languageId, domainId, createdAt, updatedAt);
        }
    }
}
