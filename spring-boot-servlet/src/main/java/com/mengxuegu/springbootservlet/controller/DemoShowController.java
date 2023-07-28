package com.mengxuegu.springbootservlet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
@RestController
public class DemoShowController {

    @GetMapping("/test")
    public String test2() {
        System.out.println(LocalDateTime.now());
        return LocalDateTime.now().toString();
    }
}
