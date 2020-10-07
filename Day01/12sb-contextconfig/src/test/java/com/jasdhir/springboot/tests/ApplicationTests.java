package com.jasdhir.springboot.tests;

import com.jasdhir.springboot.tests.config.AppConfig;
import com.jasdhir.springboot.tests.service.MyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
class ApplicationTests {

    @Autowired
    private MyService myService;

    @Test
    public void messageTest() {
        String msg = myService.getMessage();
        assertEquals("Hello World!", msg);
    }

    @Test
    public void multiplyNumTest() {
        int val = myService.multiplyNum(5, 10);
        assertEquals(50, val);
    }

    @Test
    public void idAvailabilityTest() {
        boolean val = myService.isIdAvailable(100);
        assertTrue(val);
    }

}
