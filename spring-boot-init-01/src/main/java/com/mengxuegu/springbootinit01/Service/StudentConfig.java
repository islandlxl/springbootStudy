package com.mengxuegu.springbootinit01.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@project:com.mengxuegu.springbootinit01.Service
@Title:StudentConfig
@Auther:lxl
@create:2018/12/11,19:37
*/
@Configuration
public class StudentConfig {

    @Bean
    public StudentService studentService1(){
        System.out.println("这是通过将studentconfig类把studentserivce注入到spring容器中");
        return new StudentService();
    }

}
