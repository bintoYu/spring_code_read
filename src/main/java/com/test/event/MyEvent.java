package com.test.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    private String message;

    public MyEvent(Object source,String message) {
        super(source);
        this.message = message;
        System.out.println("add event success! message:" + message);
    }

    public String getMessage(){
        return message;
    }


}
