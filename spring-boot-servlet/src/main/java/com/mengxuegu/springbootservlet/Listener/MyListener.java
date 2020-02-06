package com.mengxuegu.springbootservlet.Listener;

import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
@project:com.mengxuegu.springbootservlet.Listener
@Title:MyListener
@Auther:lxl
@create:2018/12/24,13:05
*/

public class MyListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContextListener启动了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("ServletContextListener销毁了");
    }
}
