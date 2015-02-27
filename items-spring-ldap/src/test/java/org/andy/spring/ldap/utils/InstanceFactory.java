package org.andy.spring.ldap.utils;

import org.springframework.context.ApplicationContext;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/27.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class InstanceFactory {

    /**
     * Get target class instance from Spring ApplicationContext.
     */
    public static <T> T getInstanceFromApplicationContext(Class<T> requiredType, ApplicationContext context) {
        return context.getBean(requiredType);
    }
}
