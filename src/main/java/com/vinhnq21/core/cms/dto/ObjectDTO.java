package com.vinhnq21.core.cms.dto;

import java.util.Date;
import java.sql.Timestamp;

public class ObjectDTO {

    private int id;

    private String objectName;

    private String url;

    private int parentId;

    private byte objectOrder;

    private int domainId;

    private String domainName;

    private byte isActive;

    private byte isVisible;

    private Date createdAt;

    private Date updatedAt;

    public ObjectDTO(int id, String objectName, String url, int parentId, byte objectOrder, int domainId, String domainName, byte isActive, byte isVisible, Date createdAt, Date updatedAt) {
        this.id = id;
        this.objectName = objectName;
        this.url = url;
        this.parentId = parentId;
        this.objectOrder = objectOrder;
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

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public byte getObjectOrder() {
        return objectOrder;
    }

    public void setObjectOrder(byte objectOrder) {
        this.objectOrder = objectOrder;
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
