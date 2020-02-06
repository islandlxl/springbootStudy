package com.islandlxl.springboot_shiro.mapper;

import com.islandlxl.springboot_shiro.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUsername(@Param("username") String username);
}
