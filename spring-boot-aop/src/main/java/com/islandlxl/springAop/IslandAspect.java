package com.islandlxl.springAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class IslandAspect {

    @Pointcut("execution(* com.islandlxl.springAop.CaculateImpl.*(..))")
    public void pointCut(){};

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("执行目标方法：【"+name+"】之前执行【前置通知】，入参为："+ Arrays.toString(joinPoint.getArgs()));
    };



    @After(value = "pointCut()")
    public void After(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("执行目标方法：【"+name+"】之前执行【后置通知】，入参为："+ Arrays.toString(joinPoint.getArgs()));
    };


    @AfterReturning(value = "pointCut()")
    public void AfterReturning(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("执行目标方法：【"+name+"】之前执行【返回通知】，入参为："+ Arrays.toString(joinPoint.getArgs()));
    };


    @AfterThrowing(value = "pointCut()")
    public void AfterThrowing(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("执行目标方法：【"+name+"】之前执行【异常通知】，入参为："+ Arrays.toString(joinPoint.getArgs()));
    };
}
