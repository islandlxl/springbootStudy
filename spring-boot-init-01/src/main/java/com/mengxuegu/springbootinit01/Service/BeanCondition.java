package com.mengxuegu.springbootinit01.Service;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class BeanCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (conditionContext.getBeanFactory().containsBean("student")){
            return true;
        }
        return false;
    }
}
