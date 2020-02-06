package com.islandlxl.springboot_shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = {"com.islandlxl.springboot_shiro.mapper"})
public class SpringbootShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShiroApplication.class, args);
    }

}
