package com.kuang.dao;

/**
 * @author: zhang
 * @date: 2022/3/4
 * @description:
 */
public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Oracle获取用户数据！");
    }
}
