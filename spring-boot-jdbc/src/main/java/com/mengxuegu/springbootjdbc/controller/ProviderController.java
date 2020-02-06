package com.mengxuegu.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/*
@project:com.mengxuegu.springbootjdbc.controller
@Title:ProviderController
@Auther:lxl
@create:2018/12/27,22:06
*/
@Controller
public class ProviderController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/provider")
    public Map<String,Object> list(){

       List <Map<String,Object>> map=jdbcTemplate.queryForList("select * from provider");

       System.out.println(map);
       return map.get(0);
    }
}
