package com.mengxuegu.springboot_jpa.service;

import com.mengxuegu.springboot_jpa.dao.UserRepository;
import com.mengxuegu.springboot_jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/*
@project:com.mengxuegu.springboot_jpa.service
@Title:UserServiceImpl
@Auther:lxl
@create:2019/1/1,14:32
*/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;
    @Transactional
    @Override
    public boolean addUser(User user) {

        userRepository.save(new User("1","1"));

        userRepository.save(new User("12","2"));

        userRepository.save(new User("123","3"));

        userRepository.save(new User("1234","4"));

        userRepository.save(new User("12345","5"));

        return true;
    }
}
