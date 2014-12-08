package org.springframework.samples.event;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailServiceTest {
    @Test
    public void testCustomEvent() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-event.xml");
        EmailService emailService = context.getBean(EmailService.class);
//        emailService.sendEmail("andyAlien@outlook.com", "Love you dear...");
        emailService.sendEmail("john.doe@example.org", "hands up, shit...");
    }
}