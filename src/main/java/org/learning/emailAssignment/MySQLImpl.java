package org.learning.emailAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MySQLImpl implements DataSource{

    private String[] emailLists;

    public MySQLImpl() {
        emailLists= new String[]{"abc@gmail.com", "def@gmail.com"};
    }

    @Override
    public void sendMail() {
        System.out.println("From MySQL Email sent to "+emailLists[0]);
        System.out.println("From MySQL Email sent to "+emailLists[1]);

    }
}
