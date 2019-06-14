package com.vinhnq21.core.cms.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TBL_ROLE_OBJECT")
@IdClass(RoleObject.RoleObjectPk.class)
public class RoleObject {

    @Id
    @Column(name = "ROLE_ID", unique = true, nullable = false)
    private int roleId;

    @Id
    @Column(name = "OBJECT_ID", unique = true, nullable = false)
    private int objectId;

    @Column(name = "IS_ACTIVE", unique = true, nullable = false)
    private byte isActive;

    @Column(name = "IS_VISIBLE", unique = true, nullable = false)
    private byte isVisible;

    @Column(name = "CREATED_AT", unique = true, nullable = false)
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", unique = true, nullable = false)
    private Timestamp updatedAt;

    public RoleObject() {

    }

    public RoleObject(int roleId, int objectId, byte isActive, byte isVisible, Timestamp createdAt, Timestamp updatedAt) {
        this.roleId = roleId;
        this.objectId = objectId;
        this.isActive = isActive;
        this.isVisible = isVisible;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
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

    public static class Builder {


    }

    public static class RoleObjectPk implements Serializable {

        @Id
        @Column(name = "ROLE_ID", unique = true, nullable = false)
        private int roleId;

        @Id
        @Column(name = "OBJECT_ID", unique = true, nullable = false)
        private int objectId;

        public RoleObjectPk() {}

        public RoleObjectPk(int roleId, int objectId) {
            this.roleId = roleId;
            this.objectId = objectId;
        }

        public RoleObjectPk(int roleId) {
            this.roleId = roleId;
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

        @Override
        public int hashCode() {
            return Objects.hash(roleId, objectId);
        }
    }
}