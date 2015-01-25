package org.springframework.samples.ioc.schema.injection.constructor;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class ConstructorInjectionBeanTest extends TestBase{

    public ConstructorInjectionBeanTest() {
        super("spring-ioc-schema-constructor-injection-bean.xml");
    }

    @Test
    public void testIndexConstructorInjection() throws Exception {
        //No qualifying bean of type,NoUniqueBeanDefinitionException;expected single matching bean but found 2.
        //ConstructorInjectionBean injectByConstructorParamsIndexOne = getBean(ConstructorInjectionBean.class);
        ConstructorInjectionBean injectByConstructorParamsIndexOne = getBean("injectByConstructorParamsIndexOne",
                ConstructorInjectionBean.class);
        ConstructorInjectionBean injectByConstructorParamsIndexTwo = getBean("injectByConstructorParamsIndexTwo",
                ConstructorInjectionBean.class);
        ConstructorInjectionBean injectByConstructorParamsName = getBean("injectByConstructorParamsName",
                ConstructorInjectionBean.class);
        ConstructorInjectionBean injectByConstructorParamsType = getBean("injectByConstructorParamsType",
                ConstructorInjectionBean.class);

        System.out.println(PrintUtil.formatTestResult(injectByConstructorParamsIndexOne,
                injectByConstructorParamsIndexTwo, injectByConstructorParamsName, injectByConstructorParamsType));
    }
}