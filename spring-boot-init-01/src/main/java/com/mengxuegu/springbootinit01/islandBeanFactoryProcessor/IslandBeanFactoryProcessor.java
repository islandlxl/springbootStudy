package com.mengxuegu.springbootinit01.islandBeanFactoryProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * bean定义过程中实例化之前会调用此接口
 */
@Component
public class IslandBeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("IOC容器调用了【IslandBeanFactoryProcessor】的postProcessBeanFactory方法");
        for (String name:configurableListableBeanFactory.getBeanDefinitionNames()){
            if ("islandLog".equals(name)){
                BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
              //  beanDefinition.setLazyInit(true);//实例化之前设置懒加载模式
            }
        }
    }
}
