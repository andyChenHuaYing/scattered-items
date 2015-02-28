package org.andy.spring.ldap.annotation.operation;

import org.andy.spring.ldap.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/28.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class PersonOperation {

    private static Logger logger = LoggerFactory.getLogger(PersonOperation.class);

    @Autowired
    private LdapTemplate ldapTemplate;

    /**
     * Find all persons via annotation person entity.
     */
    public List<Person> findAll() {
        List<Person> persons = ldapTemplate.findAll(Person.class);
        logger.info("Find all persons, number:{}", persons.size());
        return persons;
    }

    /**
     * Find person by uid.
     */
    public Person findPersonByUid(String uid) {
        return ldapTemplate.findOne(LdapQueryBuilder.query().where("uid").is(uid), Person.class);
    }

    public boolean deletePerson(Person person) {
        try {
            ldapTemplate.delete(person);
            logger.info("Delete successfully, person:{}", person);
            return true;
        } catch (Exception e) {
            logger.info("Delete failed, person:{} {}", person, e.getMessage());
        }
        return false;
    }

}
