package com.kuang.demo02;

/**
 * @author: zhang
 * @date: 2022/3/7
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.add();

    }
}
