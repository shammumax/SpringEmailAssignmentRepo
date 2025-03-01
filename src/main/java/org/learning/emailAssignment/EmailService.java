package org.learning.emailAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("org.learning.emailAssignment")
public class EmailService {

    @Autowired
    @Qualifier("mySQLImpl")
    private DataSource dataSource;

    //constructor injection
//    @Autowired
//    public EmailService(@Qualifier("postgreSQLImpl") DataSource dataSource) {
//    this.dataSource = dataSource;
//    }


    // setter injection
//    @Autowired
//    public void setDataSource(@Qualifier("mySQLImpl") DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    public void emailTrigger(){
        this.dataSource.sendMail();
    }
}
