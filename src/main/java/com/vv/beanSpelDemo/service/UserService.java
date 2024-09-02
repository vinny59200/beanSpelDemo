package com.vv.beanSpelDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final String message;

    @Autowired
    public UserService(@Value("#{ @user.message }") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
