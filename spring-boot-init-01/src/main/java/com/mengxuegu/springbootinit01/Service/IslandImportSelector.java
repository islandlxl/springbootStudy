package com.mengxuegu.springbootinit01.Service;

import com.mengxuegu.springbootinit01.bean.Teacher;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class IslandImportSelector implements /**ImportSelector,*/ ImportBeanDefinitionRegistrar {

//    @Override
//    public String[] selectImports(AnnotationMetadata annotationMetadata) {
//        return new String[]{"com.mengxuegu.springbootinit01.bean.Score"};
//    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Teacher.class);
        beanDefinitionRegistry.registerBeanDefinition("teacher",rootBeanDefinition);

    }
}
