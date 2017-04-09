package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class PersonTest extends TestBase {
    public PersonTest() {
        super("spring-p-namespace.xml");
    }

    @Test
    public void testPersonInfo() throws Exception {
        Person andy = (Person) getBean("andy-classic");
        Person star = (Person) getBean("star-classic");
        Person year = (Person) getBean("year");
        andy.personInfo();
        star.personInfo();
        year.personInfo();
    }
}