package com.action;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@project:com.action
@Title:Hellospring_boot
@Auther:lxl
@create:2018/12/10,12:02
*/
@Controller
public class Hellospring_boot {

    @ResponseBody
    @RequestMapping("/hello")
    public String demo(){
        return "hello spring-boot....";

    }

}
