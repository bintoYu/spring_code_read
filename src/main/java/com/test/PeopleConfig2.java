package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeopleConfig2 {
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
