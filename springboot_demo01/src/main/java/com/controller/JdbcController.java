package com.controller;

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
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/supplier")
    public List <Map<String,Object>> list(){

       List <Map<String,Object>> res=jdbcTemplate.queryForList("select * from supplier");

       System.out.println(res);
       return res;
    }

    @ResponseBody
    @GetMapping("/provider")
    public Map<String,Object> list2(){

        List <Map<String,Object>> map=jdbcTemplate.queryForList("select * from supplier");

        System.out.println(map);
        return map.get(0);
    }
}
