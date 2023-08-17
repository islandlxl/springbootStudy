package com.mengxuegu.springbootinit01.islandBeanDefinationRegisterPostProcessor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IslandLog {

    @Value("1")
    private int flag;

    public IslandLog() {
        System.out.println("IslandLog类的构造方法加载了。。。");
    }

    @Override
    public String toString() {
        return "IslandLog{" +
                "flag=" + flag +
                '}';
    }
}
