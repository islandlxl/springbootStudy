package com.islandlxl.springAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Caculate caculate = (Caculate) context.getBean("caculate");
        int add = caculate.mod(2, 4);
        System.out.println("运算结果是: "+add);
    }
}
