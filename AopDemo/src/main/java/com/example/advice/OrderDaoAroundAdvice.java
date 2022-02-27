package com.example.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class OrderDaoAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕增强前********");
        //执行被代理对象中的逻辑
        Object result = invocation.proceed();
        System.out.println("环绕增强后********");
        return result;
    }
}
