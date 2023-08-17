package com.mengxuegu.springbootinit01.bean;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
@project:com.mengxuegu.springbootinit01.bean
@Title:Student
@Auther:lxl
@create:2018/12/11,10:17
*/
//@PropertySource(value = {"classpath:student.properties"})
//@Component
//@ConfigurationProperties(prefix = "student")
//@Validated
public class Student implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("实现了DisposableBean接口的方法的实现destroy。。。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("实现了InitializingBean方法的实现afterPropertiesSet。。。");
    }

    private int id;

    //@Value("${student.Name}")
    //@Email
    private String name;
    private float money;
    private Date birthday;
    //@Value("${student.girlfriends}")
    private Map girlfriends;

    private List list;

    private Forte forte;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", birthday=" + birthday +
                ", girlfriends=" + girlfriends +
                ", list=" + list +
                ", forte=" + forte +
                '}';
    }

    public int getId() {
        return id;
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

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map getGirlfriends() {
        return girlfriends;
    }

    public void setGirlfriends(Map girlfriends) {
        this.girlfriends = girlfriends;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Forte getForte() {
        return forte;
    }

    public void setForte(Forte forte) {
        this.forte = forte;
    }

//
//    private void init() {
//        System.out.println("student这个bean对象的一个init初始化创建方法");
//    }
//
//    private void destroy() {
//        System.out.println("student这个bean对象的一个destroy销毁方法");
//    }


}
