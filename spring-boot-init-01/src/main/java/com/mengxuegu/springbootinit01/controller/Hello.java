package com.mengxuegu.springbootinit01.controller;

import com.mengxuegu.springbootinit01.dao.IslandDao;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IslandDao islandDao2;

    @Override
    public String toString() {
        return "IslandService{" +
                "islandDao=" + islandDao2 +
                '}';
    }
}
