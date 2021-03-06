package com.example.sequence;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(3)
public class Aspect3 {
    @Pointcut("execution(* com.example.sequence.MultiBeanImpl.testMulti(..))")
    public void print() {
        System.out.println("Aspect3 print");
    }

    @Before("print()")
    public void before() {
        System.out.println("before 3 ......");
    }

    @After("print()")
    public void after() {
        System.out.println("after 3 ......");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing 3 ......");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterReturning 3 ......");
    }
}
