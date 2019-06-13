package com.vinhnq21.core.cms.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TBL_ROLE_OBJECT"
//        , catalog = "cms",
//        uniqueConstraints = {
//        @UniqueConstraint(columnNames = ""),
//        @UniqueConstraint(columnNames = "")
//}
)
public class RoleObject {

    @EmbeddedId
    private RoleObjectPk idClass;

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

    public static class Builder {


    }

    @Embeddable
    public static class RoleObjectPk implements Serializable {

        @Column(name = "ROLE_ID", unique = true, nullable = false)
        private int roleId;

        @Column(name = "OBJECT_ID", unique = true, nullable = false)
        private int objectId;

        public RoleObjectPk() {}

        public RoleObjectPk(int roleId, int objectId) {
            this.roleId = roleId;
            this.objectId = objectId;
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
