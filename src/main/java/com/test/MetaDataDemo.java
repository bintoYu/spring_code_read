package com.test;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;


@Configuration("MetaDataDemoConfiguration")
public class MetaDataDemo {

    @Autowired
    private String test1() {
        return "MetaDataDemo";
    }

    @Autowired
    public String test2() {
        return "MetaDataDemo";
    }
}
