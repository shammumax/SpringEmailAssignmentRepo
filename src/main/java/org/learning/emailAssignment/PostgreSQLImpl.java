package org.learning.emailAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PostgreSQLImpl implements DataSource {

    private String[] emailLists;

    public PostgreSQLImpl() {
        emailLists = new String[]{"abc@yahoo.com","def@yahoo.com"};
    }

    @Override
    public void sendMail() {
        System.out.println("From PostgreSQL Email sent to "+emailLists[0]);
        System.out.println("From PostgreSQL Email sent to "+emailLists[1]);
    }
}
