package com.vv.beanSpelDemo.domain;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String message = "Hello from User bean!";

    public String getMessage() {
        return message;
    }
}
