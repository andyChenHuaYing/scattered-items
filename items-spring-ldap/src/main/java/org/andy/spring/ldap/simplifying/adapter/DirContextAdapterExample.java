package org.andy.spring.ldap.simplifying.adapter;

import org.andy.scattered.common.model.User;
import org.andy.spring.ldap.utils.LdapCommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.ldap.support.LdapUtils;
import org.springframework.stereotype.Component;

import javax.naming.Name;
import java.util.List;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/28.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class DirContextAdapterExample {

    private static Logger logger = LoggerFactory.getLogger(DirContextAdapterExample.class);

    @Autowired
    private LdapTemplate ldapTemplate;

    /**
     * Bind item vai DirContextAdapter which is implementation of DirContextOperations interface.
     */
    public boolean create(User user) {
        Name dn = LdapCommonUtil.buildDn(user);
        DirContextAdapter context = new DirContextAdapter(dn);
        context.setAttributeValues("objectclass", new String[]{"top", "person", "organizationalPerson", "inetOrgPerson"});
        mapToContext(user, context);
        try {
            ldapTemplate.bind(context);
            logger.info("Bind item via DirContextAdapter class successfully, item:{}", dn);
            return true;
        } catch (Exception e) {
            logger.info("Bind item via DirContextAdapter class failed, item:{}", dn);
        }
        return false;
    }

    /**
     * Modify item attributes via DirContextAdapter.
     * If no match item, throw exception : LDAP: error code 32 - No Such Object.
     */
    public boolean update(User user) {
        Name dn = LdapCommonUtil.buildDn(user);
        try {
            DirContextOperations context = ldapTemplate.lookupContext(dn);
            mapToContext(user, context);
            ldapTemplate.modifyAttributes(context);
            logger.info("Modify item via DirContextAdapter class successfully, item:{}", dn);
            return true;
        } catch (Exception e) {
            logger.info("Modify item via DirContextAdapter class failed, item:{} {}", dn, e.getMessage());
        }
        return false;
    }

    /**
     * Rename dn, Note the different with rebind();
     */
    public boolean renameDN(String oldDN, String newDN) {
        try {
            ldapTemplate.rename(oldDN, newDN);
            logger.info("Rename successfully, new dn: {}", newDN);
            return true;
        } catch (Exception e) {
            logger.info("Rename failed, new dn: {} {}", newDN, e.getMessage());
        }
        return false;
    }

    /**
     * Remove user
     */
    public boolean removeUser(User user) {
        Name dn = LdapCommonUtil.buildDn(user);
        try {
            ldapTemplate.unbind(dn);
            logger.info("Remove successfully, user : {}", user);
            return true;
        } catch (Exception e) {
            logger.info("Remove failed, user : {} {}", user, e.getMessage());
        }
        return false;
    }

    /**
     * Find item by user rdn.
     */
    public User findUserByPrimaryKey(String dn) {
        User user = ldapTemplate.lookup(dn, new QueryWithContextMapper.UserContextMapper());
        logger.info("Search result : {}", user);
        return user;
    }

    /**
     * Find items by user name.
     */
    public List<User> findUserByName(String name) {
        LdapQuery query = LdapQueryBuilder.query().where("objectclass").is("person")
                .and("cn").whitespaceWildcardsLike(name);
        List<User> userList = ldapTemplate.search(query, new QueryWithContextMapper.UserContextMapper());
        logger.info("Items count : {}", userList.size());
        return userList;
    }


    /**
     * Find all users.
     */
    public List<User> findAllUsers() {
        EqualsFilter equalsFilter = new EqualsFilter("objectclass", "person");
        return ldapTemplate.search(LdapUtils.emptyLdapName(), equalsFilter.encode(),
                new QueryWithContextMapper.UserContextMapper());
    }

    /**
     * Transfer Object to context attributes.
     */
    private void mapToContext(User user, DirContextOperations context) {
        context.setAttributeValue("cn", user.getUserName());
        context.setAttributeValue("sn", user.getRealName());
        context.setAttributeValue("description", user.getDescription());
    }
}
