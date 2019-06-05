package com.vinhnq21.core.cms.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    @Column(name = "DOMAIN_ID", unique = true, nullable = false)
    private int domainId;

    @Column(name = "IS_ACTIVE", unique = true, nullable = false)
    private byte isActive;

    @Column(name = "IS_VISIBLE", unique = true, nullable = false)
    private byte isVisible;

    @Column(name = "CREATED_AT", unique = true, nullable = false)
    private Date createdAt;

    @Column(name = "UPDATED_AT", unique = true, nullable = false)
    private Date updatedAt;

    public Role(int id, String name, int domainId, byte isActive, byte isVisible, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.domainId = domainId;
        this.isActive = isActive;
        this.isVisible = isVisible;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Role() {

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

    public static class Builder {

        private int id;
        private String name;
        private int domainId;
        private byte isActive;
        private byte isVisible;
        private Date createdAt;
        private Date updatedAt;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDomainId(int domainId) {
            this.domainId = domainId;
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

        public Builder setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Role createRole() {
            return new Role(id, name, domainId, isActive, isVisible, createdAt, updatedAt);
        }
    }
}
