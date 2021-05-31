package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableFeignClients
@RequiredArgsConstructor
public class DemoApplication {

    final TwitterClient twitterClient;

    void run(String... args) {
        System.out.println(twitterClient.search("Eduardo"));
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        DemoApplication app = applicationContext.getBean(DemoApplication.class);
        app.run(args);
    }

}
