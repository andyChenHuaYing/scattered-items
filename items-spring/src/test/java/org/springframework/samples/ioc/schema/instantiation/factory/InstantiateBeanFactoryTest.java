package org.springframework.samples.ioc.schema.instantiation.factory;

import org.junit.Test;
import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.ShowReferencesUtil;

public class InstantiateBeanFactoryTest extends TestBase{

    public InstantiateBeanFactoryTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-factory-instantiation-bean.xml");
    }

    @Test
    public void testInstantiatePlainModelOne() throws Exception {
        PlainModelOne plainModelOneOne = getBean("plainModelOneInstantiatedByNormalFactory", PlainModelOne.class);
        PlainModelOne plainModelOneTwo = getBean("plainModelOneInstantiatedByNormalFactory", PlainModelOne.class);

        PlainModelOne plainModelOneThree = getBean("plainModelOneInstantiatedByStaticFactory", PlainModelOne.class);
        PlainModelOne plainModelOneFour = getBean("plainModelOneInstantiatedByStaticFactory", PlainModelOne.class);

        ShowReferencesUtil.showReferences(plainModelOneOne, plainModelOneTwo, plainModelOneThree, plainModelOneFour);
    }
}