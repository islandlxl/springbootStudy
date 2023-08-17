package com.mengxuegu.springbootinit01.test;

import com.mengxuegu.springbootinit01.config.Main2Config;
import com.mengxuegu.springbootinit01.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
@project:com.mengxuegu.springbootinit01.Service
@Title:StudentService
@Auther:lxl
@create:2018/12/11,19:20
*/

public class TestFunService {

    public void add(){
        System.out.println("add...");
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//        Teacher teacher1 = (Teacher) context.getBean("teacher");
//        Teacher teacher2 = (Teacher)context.getBean("teacher");
//        System.out.println(teacher1==teacher2);
//        String[] definitionNames = context.getBeanDefinitionNames();
//        for (String bean:definitionNames){
//            System.out.println( "获取的bean: " +bean);
//        }
//       context.close();
//        Object member = context.getBean("member");
//        System.out.println(member);

        Object islandService = context.getBean("islandService");
        System.out.println(islandService);
//
        Object otherService = context.getBean("otherService");
        System.out.println(otherService);

//        Object mainConfig = context.getBean("islandBeanPostProcessor");
//        System.out.println(mainConfig);

//        Object scoreFactoryBean = context.getBean("scoreFactoryBean");
//        System.out.println(scoreFactoryBean);
   //     context.getEnvironment().setActiveProfiles("test","dev");
//        context.register(Main2Config.class);
//        context.refresh();
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String str:beanDefinitionNames){
//            System.out.println("beanName: "+str);
//        }
    }
}
