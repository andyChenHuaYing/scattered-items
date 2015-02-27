package org.andy.spring.ldap.utils;

import org.andy.scattered.common.model.User;
import org.springframework.ldap.support.LdapNameBuilder;

import javax.naming.Name;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/27.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class LdapCommonUtil {

    /**
     * Construct Name through LdapNameBuilder class.
     */
    public static Name buildDn(User user) {
        return LdapNameBuilder.newInstance()
                .add("ou", user.getCompany())
                .add("uid", user.getUserName())
                .build();
    }

    public static Name buildDn(String userName) {
        return LdapNameBuilder.newInstance()
                .add("ou", "People")
                .add("uid", userName)
                .build();
    }

    /**
     * Build record attributes via user properties.
     */
    public static Attributes buildAttributes(User user) {
        Attributes attributes = new BasicAttributes();
        BasicAttribute basicAttribute = new BasicAttribute("objectclass");
        basicAttribute.add("top");
        basicAttribute.add("person");
        basicAttribute.add("organizationalPerson");
        basicAttribute.add("inetOrgPerson");
        attributes.put(basicAttribute);
        attributes.put("cn", user.getUserName());
        attributes.put("sn", user.getRealName());
        attributes.put("userPassword", user.getPassword());
        return attributes;
    }
}
