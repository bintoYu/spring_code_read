package com.test.autowired;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    public String getMessage() {
        return "hello world";
    }
}
