package com.mengxuegu.springbootinit01.islandBeanDefinationRegisterPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    }
}
