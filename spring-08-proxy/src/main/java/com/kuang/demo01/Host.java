package com.kuang.demo01;

/**
 * @author: zhang
 * @date: 2022/3/7
 * @description:
 */
//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
