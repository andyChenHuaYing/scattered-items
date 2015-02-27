package org.andy.spring.ldap.basic.usage;

import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

public class QueryingItemTest extends TestBase {

    private QueryingItem queryingItem;

    public QueryingItemTest() {
        super("spring-ldap.xml");
    }

    @Test
    public void testApplicationContext() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertNotNull(queryingItem);
    }

    @Test
    public void testGetAllUserNames() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertEquals("admin", queryingItem.getAllUserNames().get(0));
    }

    @Test
    public void testGetAllUsers() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertEquals("admin", queryingItem.getAllUser().get(0).getUserName());
    }

    @Test
    public void testFindUser() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertEquals("admin", queryingItem.findUser().getUserName());
        Assert.assertEquals("admin", queryingItem.findUser().getRealName());
    }

    @Test
    public void testGetUserNameByRealName() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertEquals("admin", queryingItem.getUserNameByRealName("admin").get(0));

    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (queryingItem == null) {
            queryingItem = InstanceFactory.getInstanceFromApplicationContext(QueryingItem.class, context);
        }
    }
}