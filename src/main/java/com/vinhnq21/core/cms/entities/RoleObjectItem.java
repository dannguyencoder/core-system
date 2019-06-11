package com.vinhnq21.core.cms.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ROLE_OBJECT")
public class RoleObjectItem {

    @EmbeddedId
    private RoleObject roleObject;

}
