package com.mengxuegu.springbootinit01.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.mengxuegu.springbootinit01.Service.IslandBeanPostProcessor;
import com.mengxuegu.springbootinit01.bean.Course;
import com.mengxuegu.springbootinit01.bean.Score;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/*
@project:com.mengxuegu.springbootinit01.Service
@Title:StudentConfig
@Auther:lxl
@create:2018/12/11,19:37
*/
@Configuration
@PropertySource(value = "classpath:db.properties")
public class Main2Config {

    @Value("${userName}")
    private String userName;
    @Value("${password}")
    private String password;
    @Value("${classDriver}")
    private String classDriver;
    @Value("${jdbcUrl}")
    private String jdbcUrl;

    @Bean
    @Profile(value = "test")
    public DataSource  testDs(){
        return  builderDataSource(new DruidDataSource());
    }

    @Bean
    @Profile(value = "dev")
    public DataSource  testDevs(){
        return  builderDataSource(new DruidDataSource());
    }

    @Bean
    @Profile(value = "uat")
    public DataSource  uatDs(){
        return  builderDataSource(new DruidDataSource());
    }

    private DataSource builderDataSource(DruidDataSource dataSource){
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(classDriver);
        dataSource.setUrl(jdbcUrl);
        return dataSource;
    }
}
