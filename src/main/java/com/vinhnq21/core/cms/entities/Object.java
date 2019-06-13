package com.vinhnq21.core.cms.entities;

import javax.persistence.*;

import java.sql.Timestamp;

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

    @Column(name = "OBJECT_NAME", unique = true, nullable = false)
    private String objectName;

    @Column(name = "URL", unique = true, nullable = false)
    private String url;

    @Column(name = "PARENT_ID", unique = true, nullable = false)
    private int parentId;

    @Column(name = "OBJECT_ORDER", unique = true, nullable = false)
    private byte objectOrder;

    @Column(name = "IS_ACTIVE", unique = true, nullable = false)
    private byte isActive;

    @Column(name = "IS_VISIBLE", unique = true, nullable = false)
    private byte isVisible;

    @Column(name = "DOMAIN_ID", unique = true, nullable = false)
    private int domainId;

    @Column(name = "CREATED_AT", unique = true, nullable = false)
    private Timestamp createdAt;

    @Column(name = "UPDATED_AT", unique = true, nullable = false)
    private Timestamp updatedAt;

    public Object() {
    }

    public Object(String objectName, String url, int parentId, byte objectOrder, byte isActive, byte isVisible, int domainId, Timestamp createdAt, Timestamp updatedAt) {
        this.objectName = objectName;
        this.url = url;
        this.parentId = parentId;
        this.objectOrder = objectOrder;
        this.isActive = isActive;
        this.isVisible = isVisible;
        this.domainId = domainId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public byte getObjectOrder() {
        return objectOrder;
    }

    public void setObjectOrder(byte objectOrder) {
        this.objectOrder = objectOrder;
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
}
