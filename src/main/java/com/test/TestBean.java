package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
    private Person person;

    public void echo() {
        System.out.println("I'm a student : " + person);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
