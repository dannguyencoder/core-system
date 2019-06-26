package com.vinhnq21.core.cms.dto;

import java.util.Date;

public class CategoryDTO {

    private int id;

    private int parentId;

    private String name;

    private String friendlyUrl;

    private byte categoryOrder;

    private String metaKeywords;

    private String metaDescription;

    private String template;

    private int userId;

    private String userName;

    private int languageId;

    private String languageName;

    private int domainId;

    private String domainName;

    private byte isActive;

    private byte isVisible;

    private Date createdAt;

    private Date updatedAt;

    public CategoryDTO(int id, int parentId, String name, String friendlyUrl, byte categoryOrder, String metaKeywords, String metaDescription, String template, int userId, String userName, int languageId, String languageName, int domainId, String domainName, byte isActive, byte isVisible, Date createdAt, Date updatedAt) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.friendlyUrl = friendlyUrl;
        this.categoryOrder = categoryOrder;
        this.metaKeywords = metaKeywords;
        this.metaDescription = metaDescription;
        this.template = template;
        this.userId = userId;
        this.userName = userName;
        this.languageId = languageId;
        this.languageName = languageName;
        this.domainId = domainId;
        this.domainName = domainName;
        this.isActive = isActive;
        this.isVisible = isVisible;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public byte getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(byte categoryOrder) {
        this.categoryOrder = categoryOrder;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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
