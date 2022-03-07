package com.kuang.demo02;

/**
 * @author: zhang
 * @date: 2022/3/7
 * @description:
 */
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }

    //在公司中，改动原有的代码是大忌，因此使用代理模式拓展业务

}
