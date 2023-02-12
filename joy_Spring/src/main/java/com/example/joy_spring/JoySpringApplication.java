package com.example.joy_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableAsync
@EnableCaching
@SpringBootApplication
public class JoySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoySpringApplication.class, args);
    }

}
