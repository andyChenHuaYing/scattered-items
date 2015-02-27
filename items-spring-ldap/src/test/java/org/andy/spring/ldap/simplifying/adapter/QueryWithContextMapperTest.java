package org.andy.spring.ldap.simplifying.adapter;

import org.andy.scattered.common.model.User;
import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;

public class QueryWithContextMapperTest extends TestBase {

    private QueryWithContextMapper queryWithContextMapper;

    @Test
    public void testFindUserByUserName() throws Exception {
        instanceBasicUsageLdapTemplate();
        User user = queryWithContextMapper.findUserByUserName("admin");
        Assert.assertEquals("admin", user.getRealName());
        Assert.assertEquals(4, user.getObjectClass().length);
    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (queryWithContextMapper == null) {
            queryWithContextMapper = InstanceFactory.
                    getInstanceFromApplicationContext(QueryWithContextMapper.class, context);
        }
    }
}