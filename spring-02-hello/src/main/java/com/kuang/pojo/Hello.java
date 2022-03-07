package com.kuang.pojo;

/**
 * @author: zhang
 * @date: 2022/3/4
 * @description:
 */
public class Hello {
    private String str;

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
