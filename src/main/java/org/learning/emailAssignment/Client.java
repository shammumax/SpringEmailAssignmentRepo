package org.learning.emailAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(EmailService.class);
        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.emailTrigger();
    }

}
