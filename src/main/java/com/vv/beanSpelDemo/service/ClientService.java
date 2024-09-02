package com.vv.beanSpelDemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final String message;

    public ClientService(@Value("${client.message}") String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
