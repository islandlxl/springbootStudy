package com.islandlxl.springAop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.framework.AopContext;


public class CaculateImpl implements Caculate{



    @Override
    public int add(int num1, int num2) {
        System.out.println("add method  execute...");
       // System.out.println(1/0);
        return num1+num2;
    }

    @Override
    public int deduce(int num1, int num2) {
        System.out.println("deduce method  execute...");
        return num1-num2;
    }

    @Override
    public int multi(int num1, int num2) {
        System.out.println("multi method  execute...");
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        System.out.println("divide method  execute...");
        return num1/num2;
    }

    @Override
    public int mod(int num1, int num2) {
        System.out.println("mod method execute.....");
        //int res = this.add(num1, num2);

        int res = ((Caculate) AopContext.currentProxy()).add(num1, num2);
        return res;
    }
}
