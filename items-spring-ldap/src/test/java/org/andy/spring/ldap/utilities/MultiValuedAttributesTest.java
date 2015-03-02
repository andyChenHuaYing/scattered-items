package org.andy.spring.ldap.utilities;

import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Test;

import javax.naming.directory.Attributes;

public class MultiValuedAttributesTest extends TestBase {

    private MultiValuedAttributes multiValuedAttributes;

    @Test
    public void testGetAllAttributes() throws Exception {
        instanceBasicUsageLdapTemplate();
        Attributes attributes = multiValuedAttributes.getAllAttributes(new String[]{"objectclass"});

    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (multiValuedAttributes == null) {
            multiValuedAttributes = InstanceFactory.
                    getInstanceFromApplicationContext(MultiValuedAttributes.class, context);
        }
    }
}