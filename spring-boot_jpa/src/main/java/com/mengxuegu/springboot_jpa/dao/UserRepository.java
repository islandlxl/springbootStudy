package com.mengxuegu.springboot_jpa.dao;

import com.mengxuegu.springboot_jpa.entity.User;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/*
@project:com.mengxuegu.springboot_jpa.dao
@Title:UserRepository
@Auther:lxl
@create:2018/12/31,14:22
*/public interface UserRepository extends JpaRepository<User,Integer> {


}
