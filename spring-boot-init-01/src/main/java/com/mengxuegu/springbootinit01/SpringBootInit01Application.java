package com.mengxuegu.springbootinit01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.xml.stream.Location;

//@ImportResource(locations = {"classpath:student.xml"})
@SpringBootApplication
public class SpringBootInit01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInit01Application.class, args);

    }
}
