package com.jasdhir.springboot.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        SpringApplication application = new SpringApplication(Application.class);
        ConfigurableEnvironment environment = new StandardEnvironment();
        environment.setActiveProfiles("default");
        application.setEnvironment(environment);
        application.run(args);
    }

}
