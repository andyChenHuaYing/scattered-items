package org.andy.spring.ldap.basic.usage;

import org.andy.scattered.common.model.User;
import org.andy.spring.ldap.utils.LdapCommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Component;

import javax.naming.Name;
import javax.naming.directory.Attribute;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.ModificationItem;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/27.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class UpdatingItem {

    private static Logger logger = LoggerFactory.getLogger(UpdatingItem.class);

    @Autowired
    private LdapTemplate ldapTemplate;

    /**
     * Using rebind update recode crudely.
     * If dn not exist, add new one.
     * If dn is exist, update attributes.
     */
    public boolean updateWithRebind(User user) {
        Name dn = LdapCommonUtil.buildDn(user);
        try {
            ldapTemplate.rebind(dn, null, LdapCommonUtil.buildAttributes(user));
            logger.info("Update item successfully, new item: {}", user);
            return true;
        } catch (Exception e) {
            logger.info("Update item failed, target item{} {}", user, e.getMessage());
        }
        return false;
    }

    /**
     * Using modifyAttributes update record.
     * If dn not exist, throw exception : LDAP error code 64..
     * If dn is exist, update attributes.
     */
    public boolean updateWithModificationItem(User user) {
        Name dn = LdapCommonUtil.buildDn(user);
        try {
            Attribute attr = new BasicAttribute("userPassword", user.getPassword());
//            Attribute attr = new BasicAttribute("cn", "alienStar");
            ModificationItem itemOne = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, attr);
            ldapTemplate.modifyAttributes(dn, new ModificationItem[]{itemOne});
            logger.info("Update item successfully, new item: {}", user);
            return true;
        } catch (Exception e) {
            logger.info("Update item failed, target item{} {}", user, e.getMessage());
        }
        return false;
    }
}
