package org.andy.spring.ldap.entity;

import org.springframework.ldap.odm.annotations.*;

import javax.naming.Name;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/28.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
@Entry(objectClasses = {"people", "top"})
public final class Person {

    @Id
    private Name dn;

    @Attribute(name = "cn")
    @DnAttribute(value = "cn", index = 1)
    private String fullName;

    @DnAttribute(value = "ou", index = 0)
    @Transient
    private String company;

    private String description;

    @Transient
    private String someUnmappedField;

    public Person() {
    }

    public Person(Name dn, String fullName, String company, String description, String someUnmappedField) {
        this.dn = dn;
        this.fullName = fullName;
        this.company = company;
        this.description = description;
        this.someUnmappedField = someUnmappedField;
    }

    public Name getDn() {
        return dn;
    }

    public void setDn(Name dn) {
        this.dn = dn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSomeUnmappedField() {
        return someUnmappedField;
    }

    public void setSomeUnmappedField(String someUnmappedField) {
        this.someUnmappedField = someUnmappedField;
    }
}
