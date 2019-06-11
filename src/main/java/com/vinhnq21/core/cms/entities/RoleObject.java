package com.vinhnq21.core.cms.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Embeddable
public class RoleObject implements Serializable {

    @Column(name = "ROLE_ID", unique = true, nullable = false)
    @Id
    private int roleId;

    @Column(name = "OBJECT_ID", unique = true, nullable = false)
    @Id
    private int objectId;

    public RoleObject(int roleId, int objectId) {

        this.roleId = roleId;
        this.objectId = objectId;
    }

    public RoleObject() {

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

        private int roleId;
        private int objectId;

        public Builder setRoleId(int roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setObjectId(int objectId) {
            this.objectId = objectId;
            return this;
        }

        public RoleObject createRoleObject() {
            return new RoleObject(roleId, objectId);
        }
    }
}
