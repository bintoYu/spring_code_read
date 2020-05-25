package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DBConnection {

    @Value("${db.driver}")
    private String driverClass;

    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.username}")
    private String userName;

    @Value("${db.password}")
    private String password;

    public DBConnection(){}

    public void printDBConfigs(){
        System.out.println("Db Driver Class = " + driverClass);
        System.out.println("Db url = " + dbUrl);
        System.out.println("Db username = " + userName);
        System.out.println("Db password = " + password);
    }
}
