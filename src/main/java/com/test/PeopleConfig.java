package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Configuration
public class PeopleConfig {
    @Bean(name="person1")
    public Person person1() {
        Person person= new Person();
        person.setName("person1");
        return person;
    }

    @Bean(name="person2")
    public Person person2() {
        Person person= new Person();
        person.setName("person2");
        return person;
    }


}
