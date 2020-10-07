package com.jasdhir.springboot.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ClientBean {
    @Value("${app.window.width}")
    private int width;
    @Value("${app.window.height}")
    private int height;

    @PostConstruct
    private void postConstruct() {
        System.out.printf("width= %s, height= %s%n", width, height);
    }
}
