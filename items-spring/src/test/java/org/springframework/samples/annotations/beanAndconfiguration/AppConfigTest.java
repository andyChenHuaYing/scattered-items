package org.springframework.samples.annotations.beanAndconfiguration;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.utils.ShowReferencesUtil;

public class AppConfigTest {

    @Test
    public void testBean() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ClientServiceImpl clientService = (ClientServiceImpl) context.getBean("clientService1");
        ClientServiceImpl clientService2 = (ClientServiceImpl) context.getBean("clientService2");
        ShowReferencesUtil.showReferences(clientService.getClientDao(), clientService2.getClientDao());
    }
}