package com.vinhnq21.core.cms.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class RoleObject {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "ROLE_ID", unique = true, nullable = false)
    private int roleId;

    @Column(name = "OBJECT_ID", unique = true, nullable = false)
    private int objectId;

    @Column(name = "IS_ACTIVE", unique = true, nullable = false)
    private byte isActive;

    @Column(name = "IS_VISIBLE", unique = true, nullable = false)
    private byte isVisible;

    @Column(name = "CREATED_AT", unique = true, nullable = false)
    private Date createdAt;

    @Column(name = "UPDATED_AT", unique = true, nullable = false)
    private Date updatedAt;

    public RoleObject(int id, int roleId, int objectId, byte isActive, byte isVisible, Date createdAt, Date updatedAt) {
        this.id = id;
        this.roleId = roleId;
        this.objectId = objectId;
        this.isActive = isActive;
        this.isVisible = isVisible;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public RoleObject() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
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
        private int roleId;
        private int objectId;
        private byte isActive;
        private byte isVisible;
        private Date createdAt;
        private Date updatedAt;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setRoleId(int roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setObjectId(int objectId) {
            this.objectId = objectId;
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

        public RoleObject createRoleObject() {
            return new RoleObject(id, roleId, objectId, isActive, isVisible, createdAt, updatedAt);
        }
    }
}
