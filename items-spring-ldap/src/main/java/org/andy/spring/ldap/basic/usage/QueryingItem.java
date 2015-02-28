package org.andy.spring.ldap.basic.usage;

import org.andy.scattered.common.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.stereotype.Component;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import java.util.List;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/26.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class QueryingItem {

    private Logger logger = LoggerFactory.getLogger(QueryingItem.class);

    @Autowired
    private LdapTemplate ldapTemplate;

    /**
     * AttributesMappers that return a single attribute.
     */
    public List<String> getAllUserNames() {
        String filter = "(objectclass=person)";
        logger.info("Ldap search filter:{}", filter);
        //ldap.base is RDN.
        return ldapTemplate.search("uid=admin,ou=People", filter, new AttributesMapper<String>() {
            @Override
            public String mapFromAttributes(Attributes attributes) throws NamingException {
                return attributes.get("cn").get().toString();
            }
        });
    }

    /**
     * Custom AttributesMappers that return a user attribute.
     */
    public List<User> getAllUser() {
        return ldapTemplate.search(LdapQueryBuilder.query().
                where("objectclass").is("Person"), new UserAttributesMappers());
    }

    /**
     * Use lookup to find user with specified dn.
     */
    public User findUser() {
        String rdn = "uid=admin, ou=People";
        return ldapTemplate.lookup(rdn, new UserAttributesMappers());
    }

    /**
     * Get user name by real name.
     * The xxx.attributes("","","") means which attributes will be returned, default is all.
     */
    public List<String> getUserNameByRealName(String realName) {
        LdapQuery query = LdapQueryBuilder.query().base("uid=admin, ou=People").attributes("cn", "sn", "userPassword")
                .where("objectclass").is("person")
                .and("sn").is(realName);
        return ldapTemplate.search(query, new AttributesMapper<String>() {
            @Override
            public String mapFromAttributes(Attributes attributes) throws NamingException {
                return attributes.get("cn").get().toString();
            }
        });
    }


    /**
     * Inner AttributesMapper implement class.
     */
    private class UserAttributesMappers implements AttributesMapper<User> {
        @Override
        public User mapFromAttributes(Attributes attributes) throws NamingException {
            User user = new User();
            user.setUserName(attributes.get("cn").get().toString());
            user.setRealName(attributes.get("sn").get().toString());
            return user;
        }
    }
}
