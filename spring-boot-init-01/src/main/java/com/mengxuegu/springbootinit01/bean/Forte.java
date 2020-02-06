package com.mengxuegu.springbootinit01.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
@project:com.mengxuegu.springbootinit01.bean
@Title:Forte
@Auther:lxl
@create:2018/12/11,10:23
*/

public class Forte {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Forte{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    private Integer time;



}
