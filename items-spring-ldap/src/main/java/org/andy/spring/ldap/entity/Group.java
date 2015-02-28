package org.andy.spring.ldap.entity;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;
import java.util.Set;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/28.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
@Entry(objectClasses = {"top", "groupOfUniqueNames"}, base = "cn=groups")
public final class Group {

    @Id
    private Name dn;

    @Attribute(name = "cn")
    @DnAttribute(value = "cn")
    private String name;

    @Attribute(name = "uniqueMember")
    private Set<Name> members;

    public Group() {
    }

    public Group(Name dn, String name, Set<Name> members) {

        this.dn = dn;
        this.name = name;
        this.members = members;
    }

    public Name getDn() {
        return dn;
    }

    public void setDn(Name dn) {
        this.dn = dn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Name> getMembers() {
        return members;
    }

    public void setMembers(Set<Name> members) {
        this.members = members;
    }

    public void addMember(Name member) {
        members.add(member);
    }

    public void removeMember(Name member) {
        members.remove(member);
    }
}
