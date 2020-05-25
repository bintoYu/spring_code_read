package com.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;

@Aspect
public class AspectJTest {

    @Pointcut("execution(* *.say(..))")
    public void test(){};

    @Before("test()")
    public void beforeTest(){
        System.out.println("before................");
    }

    @After("test()")
    public void afterTest(){
        System.out.println("after...............");
    }

    @Around("test()")
    public Object arountTest(ProceedingJoinPoint point){
        System.out.println("around before.............");
        Object o = null;
        try {
            o = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after..............");
        return o;
    }
}
