package org.andy.spring.ldap.aware;

import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

public class BaseLdapNameAwareBeanTest extends TestBase {

    private BaseLdapNameAwareBean baseLdapNameAwareBean;

    @Test
    public void testGetLdapName() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertNotNull(baseLdapNameAwareBean.getLdapName());
    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (baseLdapNameAwareBean == null) {
            baseLdapNameAwareBean = InstanceFactory.getInstanceFromApplicationContext(BaseLdapNameAwareBean.class, context);
        }
    }
}