package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class PersonTest extends TestBase{
    public PersonTest() {
        super("spring-p-namespace.xml");
    }

    @Test
    public void testPersonInfo() throws Exception {
        Person andy = getBean("andy-classic");
        Person star = getBean("star-classic");
        Person year = getBean("year");
        andy.personInfo();
        star.personInfo();
        year.personInfo();
    }
}