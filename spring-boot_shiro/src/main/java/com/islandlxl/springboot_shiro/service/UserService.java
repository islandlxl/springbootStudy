package com.islandlxl.springboot_shiro.service;


import com.islandlxl.springboot_shiro.model.User;

public interface UserService {

    User findByUsername(String username);
}
