package org.andy.spring.ldap.simplifying.adapter;

import org.andy.scattered.common.model.User;
import org.andy.spring.ldap.utils.LdapCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.ContextMapper;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Component;

import javax.naming.Name;
import javax.naming.NamingException;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/27.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class QueryWithContextMapper {

    @Autowired
    private LdapTemplate ldapTemplate;

    public User findUserByUserName(String userName) {
        Name dn = LdapCommonUtil.buildDn(userName);
        return ldapTemplate.lookup(dn, new UserContextMapper());
    }

    /**
     * User ContextMapper.
     */
    protected static class UserContextMapper implements ContextMapper<User> {
        @Override
        public User mapFromContext(Object ctx) throws NamingException {
            DirContextAdapter context = (DirContextAdapter) ctx;
            User user = new User();
            user.setUserName(context.getStringAttribute("uid"));
            user.setRealName(context.getStringAttribute("sn"));
            user.setObjectClass(context.getStringAttributes("objectclass"));
            return user;
        }
    }
}
