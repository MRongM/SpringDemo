package com.example.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("execution(* com.example.dao.AnnoUserDao.add(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置增强……" + joinPoint);
    }
    @After("execution(* com.example.dao.AnnoUserDao.get(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("最终增强……" + joinPoint);
    }
    /**
     * 将 com.example.dao包下的 AnnoUserDao 类中的 get() 方法 定义为一个切点
     */
    @Pointcut(value = "execution(* com.example.dao.AnnoUserDao.get(..))")
    public void pointCut1() {
        System.out.println("pointCut1 执行...");
    }
    /**
     * 将 com.example.dao包下的 AnnoUserDao 类中的 delete() 方法 定义为一个切点
     */
    @Pointcut(value = "execution(* com.example.dao.AnnoUserDao.delete(..))")
    public void pointCut2() {
    }
    //使用切入点引用
    @Around("MyAspect.pointCut2()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕增强……1");
        proceedingJoinPoint.proceed();
        System.out.println("环绕增强……2");
    }
    //使用切入点表达式
    @AfterReturning(value = "execution(* com.example.dao.AnnoUserDao.modify(..))", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("后置返回增强……,方法返回值为：" + returnValue);
    }
}
