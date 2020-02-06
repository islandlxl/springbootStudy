package com.mengxuegu.springbootinit01.controller;

import com.mengxuegu.springbootinit01.Service.StudentService;
import com.mengxuegu.springbootinit01.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@project:com.mengxuegu.springbootinit01.controller
@Title:Hello
@Auther:lxl
@create:2020/2/4,19:50
*/
@RestController
public class Hello {

    @Autowired
    Student student;

    @RequestMapping(value = "/hello")
    public Student hello(){

        return student;
    }
}
