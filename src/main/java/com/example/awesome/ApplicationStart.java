package com.example.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // equivale => @EnableAutoConfiguration, @ComponentScan e @Configuration
public class ApplicationStart {
    public static void main(final String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
    // aula 14
}