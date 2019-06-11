package com.vinhnq21.core.cms.entities;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "TBL_OBJECT"
//        , catalog = "cms",
//        uniqueConstraints = {
//        @UniqueConstraint(columnNames = ""),
//        @UniqueConstraint(columnNames = "")
//}
)
public class Object {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "NAME", unique = true, nullable = false)
    private String name;

    @Column(name = "URL", unique = true, nullable = false)
    private String url;

    @Column(name = "PARENT_ID", unique = true, nullable = false)
    private int parentId;

    @Column(name = "ORDER", unique = true, nullable = false)
    private byte order;

    @Column(name = "IS_ACTIVE", unique = true, nullable = false)
    private byte isActive;

    @Column(name = "IS_VISIBLE", unique = true, nullable = false)
    private byte isVisible;

    @Column(name = "DOMAIN_ID", unique = true, nullable = false)
    private int domainId;

    public Object(int id, String name, String url, int parentId, byte order, byte isActive, byte isVisible, int domainId) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.parentId = parentId;
        this.order = order;
        this.isActive = isActive;
        this.isVisible = isVisible;
        this.domainId = domainId;
    }

    public Object() {

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

    public byte getOrder() {
        return order;
    }

    public void setOrder(byte order) {
        this.order = order;
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

    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
    }

    public static class Builder {

        private int id;
        private String name;
        private String url;
        private int parentId;
        private byte order;
        private byte isActive;
        private byte isVisible;
        private int domainId;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setParentId(int parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setOrder(byte order) {
            this.order = order;
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

        public Builder setDomainId(int domainId) {
            this.domainId = domainId;
            return this;
        }

        public Object createObject() {
            return new Object(id, name, url, parentId, order, isActive, isVisible, domainId);
        }
    }
}
