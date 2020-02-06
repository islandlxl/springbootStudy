package com.mengxuegu.springboot_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }

}

