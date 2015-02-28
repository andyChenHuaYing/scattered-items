package org.andy.spring.ldap.annotation.operation;

import org.andy.spring.ldap.entity.Person;
import org.andy.spring.ldap.testbase.TestBase;
import org.andy.spring.ldap.utils.InstanceFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.ldap.support.LdapNameBuilder;

import java.util.List;

public class PersonOperationTest extends TestBase {

    private PersonOperation personOperation;

    @Test
    public void testDeletePerson() throws Exception {
        instanceBasicUsageLdapTemplate();
        Person person = new Person(LdapNameBuilder.newInstance().build(), "Some Person", "People", "dsc", "");
        Assert.assertEquals(true, personOperation.deletePerson(person));

    }

    @Test
    public void testFindPersonByUid() throws Exception {
        instanceBasicUsageLdapTemplate();
        Person person = personOperation.findPersonByUid("admin");
        Assert.assertNotNull(person);

    }

    @Test
    public void testFindAll() throws Exception {
        instanceBasicUsageLdapTemplate();
        List<Person> persons = personOperation.findAll();
        for (Person person : persons) {
            System.out.println(person.getFullName());
        }
        Assert.assertNotNull(persons);
    }

    /**
     * Instance Test target class.
     */
    private void instanceBasicUsageLdapTemplate() {
        if (personOperation == null) {
            personOperation = InstanceFactory.
                    getInstanceFromApplicationContext(PersonOperation.class, context);
        }
    }
}