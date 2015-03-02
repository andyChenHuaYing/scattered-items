package org.andy.spring.ldap.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ldap.core.support.BaseLdapNameAware;
import org.springframework.stereotype.Component;

import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import java.util.List;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/3/2.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class BaseLdapNameAwareBean implements BaseLdapNameAware {

    private static Logger logger = LoggerFactory.getLogger(BaseLdapNameAwareBean.class);

    private LdapName baseLdapPath;

    public String getLdapName() {
        List<Rdn> rdns = baseLdapPath.getRdns();
        logger.info("Relative distinguished names:{}", rdns.toString());
        return rdns.toString();
    }

    @Override
    public void setBaseLdapPath(LdapName baseLdapPath) {
        this.baseLdapPath = baseLdapPath;
    }
}
