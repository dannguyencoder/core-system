package com.vinhnq21.core.cms.dto;

import javax.persistence.Column;
import java.util.Date;
import java.sql.Timestamp;

public class TokenDTO {

    private int id;

    private String token;

    private Date expireDate;

    private byte isActive;

    private byte isVisible;

    private Date createdAt;

    private Date updatedAt;

    public TokenDTO(String token) {
        this.token = token;
    }

    public TokenDTO(int id, String token, Date expireDate, byte isActive, byte isVisible, Date createdAt, Date updatedAt) {
        this.id = id;
        this.token = token;
        this.expireDate = expireDate;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
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
