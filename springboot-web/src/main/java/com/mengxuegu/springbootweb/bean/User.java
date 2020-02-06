package com.mengxuegu.springbootweb.bean;

/*
@project:com.mengxuegu.springbootweb.bean
@Title:User
@Auther:lxl
@create:2018/12/16,22:31
*/public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
