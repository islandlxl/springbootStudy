package com.mengxuegu.springboot_jpa.entity;

import javax.persistence.*;

/*
@project:com.mengxuegu.springboot_jpa.entity
@Title:User
@Auther:lxl
@create:2018/12/31,14:16
*/
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String username;
    @Column
    private String password;

    public Integer getId() {
        return id;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
