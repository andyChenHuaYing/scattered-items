package org.andy.spring.ldap.basic.usage;

import org.andy.scattered.common.model.User;
import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

public class AddingItemTest extends TestBase {

    private AddingItem addingItem;

    public AddingItemTest() {
        super("spring-ldap.xml");
    }

    @Test
    public void testCreate() throws Exception {
        instanceBasicUsageLdapTemplate();
        User user = new User("alien", "alien", "password", "People");
        Assert.assertEquals(true, addingItem.create(user));
    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (addingItem == null) {
            addingItem = InstanceFactory.getInstanceFromApplicationContext(AddingItem.class, context);
        }
    }
}