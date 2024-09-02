package com.vv.beanSpelDemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testMessageInjection() {
        String expectedMessage = "Hello from User bean!";
        String actualMessage = userService.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}