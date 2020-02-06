package com.mengxuegu.springbootbill.config;

import com.mengxuegu.springbootbill.component.MyLocalResolver;
import com.mengxuegu.springbootbill.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/*
@project:com.mengxuegu.springbootbill.config
@Title:SpringMVCconfigurer
@Auther:lxl
@create:2018/12/21,22:19
*/
@Configuration
public class SpringMVCconfigurer  {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {

                registry.addViewController("/").setViewName("main/login");
                registry.addViewController("/index.html").setViewName("main/login");

                registry.addViewController("/main.html").setViewName("main/index");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginHandlerInterceptor())
//                  /** -----拦截所有的请求
                        .addPathPatterns("/**").
//                        排除所有不需要的请求
                      excludePathPatterns("/","/index.html","/login",
                                "/css/**","/js/**","/img/**");


            }
        };
    }

//    区域解析器
    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocalResolver();
    }




}
