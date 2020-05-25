package com.test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<MyEvent> {

    @Async
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("listener get event, sleep 2 second...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("receive event, messsage:" +  event.getMessage());
    }
}
