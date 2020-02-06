package com.mengxuegu.springbootmybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mengxuegu.springbootmybaits.mapper")
@SpringBootApplication
public class SpringBootMybaitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybaitsApplication.class, args);
    }

}

