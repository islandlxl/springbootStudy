package com.mengxuegu.springbootinit01.islandBeanDefinationRegisterPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * bean定义也即bean创建之前时机触发
 */
@Component
public class IslandBeanDefinationRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("IslandBeanDefinationRegisterPostProcessor这个类的postProcessBeanDefinitionRegistry方法被调用了。。。");
        System.out.println("bean定义的数据量： "+beanDefinitionRegistry.getBeanDefinitionCount());
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(IslandLog.class);
        beanDefinitionRegistry.registerBeanDefinition("islandLog",rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("IslandBeanDefinationRegisterPostProcessor这个类的postProcessBeanFactory方法被调用了。。。");
        System.out.println("bean定义的数据量： "+configurableListableBeanFactory.getBeanDefinitionCount());
    }
}
