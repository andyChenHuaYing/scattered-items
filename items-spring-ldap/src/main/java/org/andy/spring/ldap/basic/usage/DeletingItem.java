package org.andy.spring.ldap.basic.usage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Component;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/27.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class DeletingItem {

    private static Logger logger = LoggerFactory.getLogger(DeletingItem.class);

    @Autowired
    private LdapTemplate ldapTemplate;

    public boolean removeData(String dn) {
        try {
            logger.info("Remove item {} successfully", dn);
            ldapTemplate.unbind(dn);
            return true;
        } catch (Exception e) {
            logger.info("Remove failed, item {} ,{}", dn, e.getMessage());
        }
        return false;
    }
}
