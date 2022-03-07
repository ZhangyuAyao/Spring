package com.kuang.demo02;

/**
 * @author: zhang
 * @date: 2022/3/7
 * @description:
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.add();
    }

    @Override
    public void update() {
        log("update");
        userService.add();
    }

    @Override
    public void query() {
        log("query");
        userService.add();
    }

    //日志方法
    public void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
