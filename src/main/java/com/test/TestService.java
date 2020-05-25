package com.test;

import com.test.autowired.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {
    @Autowired
    private MessageService messageService;

    public void test() {
        messageService.getMessage();
    }
}
