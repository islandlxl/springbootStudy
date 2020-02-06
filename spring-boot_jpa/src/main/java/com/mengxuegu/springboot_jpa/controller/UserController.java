package com.mengxuegu.springboot_jpa.controller;

import com.mengxuegu.springboot_jpa.dao.UserRepository;
import com.mengxuegu.springboot_jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
@project:com.mengxuegu.springboot_jpa.controller
@Title:UserController
@Auther:lxl
@create:2018/12/31,14:28
*/
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable ("id") Integer id){

        return userRepository.findById(id).get();
    }
    @GetMapping("/user")
    public User addUser(User user){
        return userRepository.save(user);
    }
}
