package com.vinhnq21.core.cms.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "TBL_TOKEN"
//        , catalog = "cms",
//        uniqueConstraints = {
//        @UniqueConstraint(columnNames = ""),
//        @UniqueConstraint(columnNames = "")
//}
)
public class Token {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "TOKEN", unique = true, nullable = false)
    private String token;

    @Column(name = "EXPIRE_DATE", unique = true, nullable = false)
    private Date expireDate;

    @Column(name = "CREATED_AT", unique = true, nullable = false)
    private Date createdAt;

    @Column(name = "UPDATED_AT", unique = true, nullable = false)
    private Date updatedAt;

    public Token(int id, String token, Date expireDate, Date createdAt, Date updatedAt) {
        this.id = id;
        this.token = token;
        this.expireDate = expireDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Token() {

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
        private String token;
        private Date expireDate;
        private Date createdAt;
        private Date updatedAt;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setToken(String token) {
            this.token = token;
            return this;
        }

        public Builder setExpireDate(Date expireDate) {
            this.expireDate = expireDate;
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

        public Token createToken() {
            return new Token(id, token, expireDate, createdAt, updatedAt);
        }
    }
}
