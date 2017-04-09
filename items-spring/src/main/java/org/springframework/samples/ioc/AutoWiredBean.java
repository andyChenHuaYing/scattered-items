package org.springframework.samples.ioc;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 20:51
 */
public class AutoWiredBean {
    private AutowiredBeanParameter autowiredBeanParameter;

    public AutoWiredBean() {
        System.out.println(this.getClass().getName() + " is instantiated...");
    }

    public void showAutowiredBeanParameter() {
        System.out.println(autowiredBeanParameter.toString());
    }

    public void setAutowiredBeanParameter(AutowiredBeanParameter autowiredBeanParameter) {
        this.autowiredBeanParameter = autowiredBeanParameter;
    }
}
