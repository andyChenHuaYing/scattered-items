package org.springframework.samples.testbase;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * Happy day, happy life.
 *
 * Instance ClassPathXmlApplicationContext by springXmlPath.
 * Support base get Beans methods.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-14 18:45
 */
public class TestBase {
    private String springXmlPath;
    protected ClassPathXmlApplicationContext context;

    public TestBase() {
    }

    public TestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    /**
     * Init and start ClassPathXmlApplicationContext.
     */
    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            context = new ClassPathXmlApplicationContext("classpath*:*.xml");
        } else {
            context = new ClassPathXmlApplicationContext(springXmlPath);
        }
        context.start();
    }

    /**
     * Destroy ClassPathXmlApplicationContext.
     */
    @After
    public void after() {
        context.destroy();
    }

    /**
     * Return an instance, which may be shared or independent, of the specified bean.
     * <p>This method allows a Spring BeanFactory to be used as a replacement for the
     * Singleton or Prototype design pattern. Callers may retain references to
     * returned objects in the case of Singleton beans.
     * <p>Translates aliases back to the corresponding canonical bean name.
     * Will ask the parent factory if the bean cannot be found in this factory instance.
     *
     * @param name the name of the bean to retrieve
     * @return an instance of the bean
     */
    public Object getBean(String name) {
        return context.getBean(name);
    }

    /**
     * Return the bean instance that uniquely matches the given object type, if any.
     *
     * @param requiredType type the bean must match; can be an interface or superclass.
     *                     {@code null} is disallowed.
     *                     <p>This method goes into {@link org.springframework.beans.factory.ListableBeanFactory} by-type lookup territory
     *                     but may also be translated into a conventional by-name lookup based on the name
     *                     of the given type. For more extensive retrieval operations across sets of beans,
     *                     use {@link org.springframework.beans.factory.ListableBeanFactory} and/or {@link org.springframework.beans.factory.BeanFactoryUtils}.
     * @return an instance of the single bean matching the required type
     */
    public <T> T getBean(Class<T> requiredType) {
        return context.getBean(requiredType);
    }

    /**
     * @param name         the name of the bean to retrieve
     * @param requiredType type the bean must match. Can be an interface or superclass
     *                     of the actual class, or {@code null} for any match. For example, if the value
     *                     is {@code Object.class}, this method will succeed whatever the class of the
     *                     returned instance.
     * @return an instance of the bean
     */
    public <T> T getBean(String name, Class<T> requiredType) {
        return context.getBean(name, requiredType);
    }
}