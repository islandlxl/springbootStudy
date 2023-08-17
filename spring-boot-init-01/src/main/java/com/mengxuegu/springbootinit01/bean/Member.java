package com.mengxuegu.springbootinit01.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

//@PropertySource(value = "classpath:./")
public class Member {

//    @Value("xueliang")
    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
