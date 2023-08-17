package com.mengxuegu.springbootinit01.Service;

import com.mengxuegu.springbootinit01.bean.Score;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import sun.reflect.generics.scope.Scope;

public class ScoreFactoryBean implements FactoryBean<Score> {

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Score getObject() throws Exception {
        return new Score();
    }

    @Override
    public Class<?> getObjectType() {
        return Scope.class;
    }
}
