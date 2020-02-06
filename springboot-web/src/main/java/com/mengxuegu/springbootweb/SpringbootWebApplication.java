package com.mengxuegu.springbootweb;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }

    public ViewResolver MyViewResolver(){
        return new MyViewResolver();
    }
    class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}

