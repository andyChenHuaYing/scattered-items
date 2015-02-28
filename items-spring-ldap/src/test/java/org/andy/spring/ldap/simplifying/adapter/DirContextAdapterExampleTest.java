package org.andy.spring.ldap.simplifying.adapter;

import org.andy.scattered.common.model.User;
import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DirContextAdapterExampleTest extends TestBase {

    private DirContextAdapterExample example;

    @Test
    public void testCreate() throws Exception {
        instanceBasicUsageLdapTemplate();
        User user = new User("alien_chen", "alien", "chen", "People", "DirContextAdapter create description.");
        Assert.assertEquals(true, example.create(user));
    }

    @Test
    public void testUpdate() throws Exception {
        instanceBasicUsageLdapTemplate();
        //exist
        User user = new User("alien_chen", "alien", "chen", "People", "Update DirContextAdapter create description.");

        //not exist
        //User user = new User("alien_chen_year", "alien", "chen", "People", "Update DirContextAdapter create description.");

        Assert.assertEquals(true, example.update(user));
    }

    @Test
    public void testRename() throws Exception {
        instanceBasicUsageLdapTemplate();
        boolean result = example.renameDN("uid=star, ou=People", "uid=star_rename, ou=People");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testFindUserByPrimaryKey() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertNotNull(example.findUserByPrimaryKey("uid=admin,ou=People"));
    }

    @Test
    public void testRemoveUser() throws Exception {
        instanceBasicUsageLdapTemplate();
        User user = new User("alien_chen", "alien", "chen", "People", "Update DirContextAdapter create description.");
        Assert.assertEquals(true, example.removeUser(user));
    }

    @Test
    public void testFindUserByName() throws Exception {
        instanceBasicUsageLdapTemplate();
        List<User> userList = example.findUserByName("alien");
        Assert.assertNotNull(userList);
    }

    @Test
    public void testFindAllUsers() throws Exception {
        instanceBasicUsageLdapTemplate();
        Assert.assertNotNull(example.findAllUsers());
    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (example == null) {
            example = InstanceFactory.
                    getInstanceFromApplicationContext(DirContextAdapterExample.class, context);
        }
    }
}