package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author: zhang
 * @date: 2022/3/7
 * @description:
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue：返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回结果为： "+returnValue);
    }
}
