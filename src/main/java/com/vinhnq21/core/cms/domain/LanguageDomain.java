package com.vinhnq21.core.cms.domain;

import javax.persistence.Column;
import java.sql.Timestamp;

public class LanguageDomain {

    private int id;

    private String name;

    private String code;

    private int domainName;

    private byte isActive;

    private byte isVisible;

    private Timestamp createdAt;

    private Timestamp updatedAt;

}
