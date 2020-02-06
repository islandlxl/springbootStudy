package com.islandlxl.springboot_shiro.service;

import com.islandlxl.springboot_shiro.mapper.UserMapper;
import com.islandlxl.springboot_shiro.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
