package org.springframework.samples.ioc.schema.alias;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AliasByNamePropertyBeanTest extends TestBase {



    public AliasByNamePropertyBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-alias-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        List<AliasByNamePropertyBean> list = new ArrayList<>();
        list.add(getBean("aliasByNamePropertyBeanOne", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanTwo", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanThree", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameOne", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameTwo", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameThree", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameFour", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameFive", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameSix", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameSeven", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameEight", AliasByNamePropertyBean.class));
        list.add(getBean("aliasByNamePropertyBeanNameNigh", AliasByNamePropertyBean.class));

        StringBuilder stringBuilder = new StringBuilder();
        Set<Integer> hashCodes = new HashSet<>();
        int hashCode;
        for (AliasByNamePropertyBean aliasByNamePropertyBean : list) {
            hashCode = aliasByNamePropertyBean.hashCode();
            stringBuilder.append(hashCode).append(" : ");
            hashCodes.add(hashCode);
        }
        stringBuilder.substring(0, stringBuilder.lastIndexOf(":"));
        System.out.println(hashCodes);
        System.out.println(stringBuilder.toString());
        System.out.println(PrintUtil.formatTestResult(list));
    }
}