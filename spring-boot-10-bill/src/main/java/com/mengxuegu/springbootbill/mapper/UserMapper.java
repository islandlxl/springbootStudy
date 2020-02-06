package com.mengxuegu.springbootbill.mapper;

import com.mengxuegu.springbootbill.entities.Bill;
import com.mengxuegu.springbootbill.entities.BillProvider;
import com.mengxuegu.springbootbill.entities.User;

import java.util.List;

/*
@project:com.mengxuegu.springbootbill.mapper
@Title:BillMapper
@Auther:lxl
@create:2019/1/19,11:18
*/public interface UserMapper {
    List<User>  getUsers(User user);

    User  getUserById(Integer id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUserByid(Integer id);

    User  getUserByUsername(String username);

}
