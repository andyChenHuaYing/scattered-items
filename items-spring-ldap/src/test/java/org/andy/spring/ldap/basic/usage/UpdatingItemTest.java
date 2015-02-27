package org.andy.spring.ldap.basic.usage;

import org.andy.scattered.common.model.User;
import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

public class UpdatingItemTest extends TestBase {

    private UpdatingItem updatingItem;

    @Test
    public void testUpdate() throws Exception {
        instanceBasicUsageLdapTemplate();
        User user = new User("year", "year", "password_rebind", "People");
        Assert.assertEquals(true, updatingItem.updateWithRebind(user));
    }

    @Test
    public void testUpdateWithModificationItem() throws Exception {
        instanceBasicUsageLdapTemplate();
        User user = new User("year", "year", "password_modifyAttributes", "People");
        Assert.assertEquals(true, updatingItem.updateWithModificationItem(user));
    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (updatingItem == null) {
            updatingItem = InstanceFactory.getInstanceFromApplicationContext(UpdatingItem.class, context);
        }
    }
}