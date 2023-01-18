package com.homework.githubactionsdemo.controller;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DemoControllerTest {

    @InjectMocks
    private DemoController demoController;

    @Test
    void demoTest() {
        assertEquals("This is a Github actions demo", demoController.demo());
    }
}
