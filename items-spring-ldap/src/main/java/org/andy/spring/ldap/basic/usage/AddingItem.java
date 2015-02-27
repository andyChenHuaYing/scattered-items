package org.andy.spring.ldap.basic.usage;

import org.andy.scattered.common.model.User;
import org.andy.spring.ldap.utils.LdapCommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Component;

import javax.naming.Name;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/27.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class AddingItem {

    private static Logger logger = LoggerFactory.getLogger(AddingItem.class);

    @Autowired
    private LdapTemplate ldapTemplate;

    /**
     * Add date to ldap.
     */
    public boolean create(User user) {
        Name dn = LdapCommonUtil.buildDn(user);
        try {
            ldapTemplate.bind(dn, null, LdapCommonUtil.buildAttributes(user));
            logger.info("Add item {} successfully.", dn);
            return true;
        } catch (Exception e) {
            logger.info("Add item fail, item: {}, {} ", dn, e.getMessage());
        }
        return false;
    }


}
