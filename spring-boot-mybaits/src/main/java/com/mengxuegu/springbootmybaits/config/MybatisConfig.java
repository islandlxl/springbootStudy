package com.mengxuegu.springbootmybaits.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@project:com.mengxuegu.springbootmybaits.config
@Title:MybatisConfig
@Auther:lxl
@create:2018/12/29,13:19
*/
@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer customizer(){

        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {

                configuration.setMapUnderscoreToCamelCase(true);

            }
        };


    }


}
