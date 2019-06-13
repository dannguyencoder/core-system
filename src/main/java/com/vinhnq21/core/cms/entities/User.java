package com.vinhnq21.core.cms.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "TBL_USER"
//        , catalog = "cms",
//        uniqueConstraints = {
//        @UniqueConstraint(columnNames = ""),
//        @UniqueConstraint(columnNames = "")
//}
)
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "USERNAME", unique = true, nullable = false)
    private String username;

    @Column(name = "PASSWORD", unique = true, nullable = false)
    private String password;

    @Column(name = "ROLE_ID", unique = true, nullable = false)
    private int roleId;

    @Column(name = "DOMAIN_ID", unique = true, nullable = false)
    private int domainId;

    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @Column(name = "CREATED_AT", unique = true, nullable = false)
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", unique = true, nullable = false)
    private Timestamp updatedAt;

    @Column(name = "IS_VISIBLE", unique = true, nullable = false)
    private byte isVisible;

    @Column(name = "IS_ACTIVE", unique = true, nullable = false)
    private byte isActive;

    @Column(name = "IS_ADMIN", unique = true, nullable = false)
    private byte isAdmin;

    @Column(name = "TOKEN", unique = true, nullable = false)
    private String token;

    public User(int id, String username, String password, int roleId, int domainId, String email, Timestamp createdAt, Timestamp updatedAt, byte isActive, byte isAdmin, String token) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleId = roleId;
        this.domainId = domainId;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isActive = isActive;
        this.isAdmin = isAdmin;
        this.token = token;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public byte getIsActive() {
        return isActive;
    }

    public void setIsActive(byte isActive) {
        this.isActive = isActive;
    }

    public byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class Builder {

        private int id;
        private String username;
        private String password;
        private int roleId;
        private int domainId;
        private String email;
        private Timestamp createdAt;
        private Timestamp updatedAt;
        private byte isActive;
        private byte isAdmin;
        private String token;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRoleId(int roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setDomainId(int domainId) {
            this.domainId = domainId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCreatedAt(Timestamp createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(Timestamp updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setIsActive(byte isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setIsAdmin(byte isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public User createUser() {
            return new User(id, username, password, roleId, domainId, email, createdAt, updatedAt, isActive, isAdmin, token);
        }
    }
}
