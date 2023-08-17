package com.mengxuegu.springbootinit01.Service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class IslandBeanPostProcessor implements BeanPostProcessor {

    public IslandBeanPostProcessor() {
        System.out.println("IslandBeanPostProcessor这个bean的无参数构造方法。。。。");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("IslandBeanPostProcessor实现BeanPostProcessor前置处理器接口的前置方法postProcessBeforeInitialization。。。。");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("IslandBeanPostProcessor实现BeanPostProcessor前置处理器接口的后置方法postProcessAfterInitialization。。。。");
        return bean;
    }
}
