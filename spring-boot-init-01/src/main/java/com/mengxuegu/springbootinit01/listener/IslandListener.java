package com.mengxuegu.springbootinit01.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class IslandListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("IslandListener自定义类开始接受事件了。。。"+applicationEvent);
    }
}
