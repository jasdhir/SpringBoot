package com.jasdhir.springboot.cl;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(1)
public class CommandLineRunnerBean implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CommandLineRunnerBean.class);
    public void run(String... args) {
       logger.info("Application started with arguments CL Runner:" +  Arrays.toString(args));
    }
}
