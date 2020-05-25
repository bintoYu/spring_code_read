package com.test.autowired;

import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {

    public String getPeople() {
        return "hello world";
    }
}
