package com.jasdhir.springboot;

import com.jasdhir.springboot.myclasses.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(Application.class, args);


        final Team team = ctx.getBean(Team.class);
        System.out.println("--- Team ---");
        System.out.println(team);

    }

}
