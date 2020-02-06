package com.mengxuegu.springbootweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
@project:com.mengxuegu.springbootweb.config
@Title:MyspringMVCConfigutature
@Auther:lxl
@create:2018/12/21,19:08
不能用@EnableWebMvc
视图控制器的配置
*/
@Configuration
public class MyspringMVCConfigutature implements WebMvcConfigurer {
//   增加视图控制
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/mengxuegu").setViewName("success");
    }
}
