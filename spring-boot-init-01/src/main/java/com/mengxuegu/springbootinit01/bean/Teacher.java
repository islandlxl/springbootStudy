package com.mengxuegu.springbootinit01.bean;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Teacher {
    @PostConstruct
    public void init(){
        System.out.println("JSR250规范注解@PostConstruct实现初始化teacher这个bean的init初始化。。。");

    }

    @PreDestroy
    public void destroy(){
        System.out.println("JSR250规范注解@PreDestroy实现初始化teacher这个bean的destroy初始化。。。");

    }

    private int tid;
    private int age;
    private String sex;
    private String tName;
    private String degree;
    private String position;

    public Teacher() {
        System.out.println("teacher -加载了。。。");
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
