package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author: zhang
 * @date: 2022/3/6
 * @description:
 */
//相当于<bean id="user" class="com.kuang.pojo.User"/>
    //@Component 组件
@Component
@Scope("prototype")
public class User {

    public String name;

    //相当于<property name="name" value="kuangshen"/>
    @Value("kuangsheng")
    public void setName(String name) {
        this.name = name;
    }
}
