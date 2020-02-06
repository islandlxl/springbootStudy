package com.mengxuegu.springbootbill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mengxuegu.springbootbill.mapper")
public class SpringBootBillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBillApplication.class, args);
    }

}

