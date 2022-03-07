package com.kuang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: zhang
 * @date: 2022/3/7
 * @description:
 */
public class Log implements MethodBeforeAdvice {

    //method: 要执行的目标对象的方法
    //Object：参数
    //target：目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass()+"的"+method.getName()+"被执行了");
    }
}
