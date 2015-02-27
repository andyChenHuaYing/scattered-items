package org.andy.spring.ldap.basic.usage;

import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

public class DeletingItemTest extends TestBase {

    private DeletingItem deletingItem;

    public DeletingItemTest() {
        super("spring-ldap.xml");
    }

    @Test
    public void testRemoveData() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertEquals(true, deletingItem.removeData("uid=alien,ou=People"));
    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (deletingItem == null) {
            deletingItem = InstanceFactory.getInstanceFromApplicationContext(DeletingItem.class, context);
        }
    }
}