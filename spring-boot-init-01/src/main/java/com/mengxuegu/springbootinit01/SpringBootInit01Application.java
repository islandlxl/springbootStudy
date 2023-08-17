package com.mengxuegu.springbootinit01;

import com.mengxuegu.springbootinit01.bean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.Location;

//@ImportResource(locations = {"classpath:student.xml"})
@SpringBootApplication
public class SpringBootInit01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInit01Application.class, args);

    }
}
