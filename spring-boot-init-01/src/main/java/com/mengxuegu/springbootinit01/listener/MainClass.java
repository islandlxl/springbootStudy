package com.mengxuegu.springbootinit01.listener;

import com.mengxuegu.springbootinit01.config.Main2Config;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * bean创建过程中监听事件的发布接收
 */
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        context.publishEvent(new ApplicationEvent("手动发布一个事件！！！") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        context.close();
    }
}
