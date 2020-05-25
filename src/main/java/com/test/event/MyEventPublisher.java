package com.test.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(String message){
        MyEvent event = new MyEvent(this,message);
        for(int i = 0; i < 10; i++) {
            applicationEventPublisher.publishEvent(event);
        }
    }
}
