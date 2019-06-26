package com.vinhnq21.core.cms.dto;

import java.sql.Timestamp;
import java.util.Date;

public class RoleDTO {

    private int id;

    private String name;

    private int domainId;

    private String domainName;

    private byte isActive;

    private byte isVisible;

    private Date createdAt;

    private Date updatedAt;

    public RoleDTO(int id, String name, int domainId, String domainName, byte isActive, byte isVisible, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
