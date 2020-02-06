package com.mengxuegu.springbootweb.controller;

/*
@project:com.mengxuegu.springbootweb.controller
@Title:HelloController
@Auther:lxl
@create:2018/12/16,10:57
*/

import com.mengxuegu.springbootweb.bean.Provide;
import com.mengxuegu.springbootweb.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.Name;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("success")
    @ResponseBody
    public String  execute(){

        return "hello springboot-web";
    }
    @RequestMapping("execute")
    public String success(Map<String,Object> map){

        map.put("name","小明");

        return "success";
    }
    @RequestMapping("/show")
    public String show(Map<String,Object> map,HttpServletRequest request){

        List<User> list=new ArrayList<User>();
        list.add(new User(101,"zhangsan"));
        list.add(new User(102,"lisi"));

        map.put("list",list);
        map.put("sex",1);
        map.put("man",2);
        map.put("desc","欢迎来到<h1>梦学谷</h1>");
        request.getSession().setAttribute("user",new User(1001,"wangwu"));
        return "public";
    }


    @RequestMapping("/study")
    public String study(Map<String,Object> map, HttpServletRequest request){

        List<User> list=new ArrayList<User>();

        list.add(new User(1001,"哈根斯"));
        list.add(new User(1002, "萝卜丝"));
        list.add(new User(1003,"辣条"));
        map.put("list",list);

        return "study";
    }
    @RequestMapping("list")
    public String list(Map<String,Object> map){

        List<Provide> list=new ArrayList<Provide>();
        list.add(new Provide("PRO-CODE—001","测试供应商001","张三",12121212,323232323,"2015-11-12"));

        list.add(new Provide("PRO-CODE—001","测试供应商001","张三",12121212,323232323,"2015-11-12"));
        list.add(new Provide("PRO-CODE—001","测试供应商001","张三",12121212,323232323,"2015-11-12"));

        map.put("list",list);
        return "list";
    }






}
