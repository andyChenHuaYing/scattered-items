package org.andy.spring.ldap.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.DefaultIncrementalAttributesMapper;
import org.springframework.stereotype.Component;

import javax.naming.directory.Attributes;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/3/2.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Component
public class MultiValuedAttributes {

    private static Logger logger = LoggerFactory.getLogger(MultiValuedAttributes.class);

    @Autowired
    private LdapTemplate ldapTemplate;

    public Attributes getAllAttributes(String[] attributeNames) {
        Attributes attributes = DefaultIncrementalAttributesMapper.lookupAttributes(ldapTemplate, "", attributeNames);
        logger.info("Get all attributes count:{}", attributes.size());
        return attributes;
    }
}
