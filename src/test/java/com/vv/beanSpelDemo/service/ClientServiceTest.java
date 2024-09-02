package com.vv.beanSpelDemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientServiceTest {

    @Autowired
    private ClientService clientService;

    @Test
    public void testMessageInjection() {
        String expectedMessage = "Hello from properties file!";
        String actualMessage = clientService.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}