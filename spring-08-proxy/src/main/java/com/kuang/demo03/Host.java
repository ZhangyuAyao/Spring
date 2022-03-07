package com.kuang.demo03;

import com.kuang.demo03.Rent;

/**
 * @author: zhang
 * @date: 2022/3/7
 * @description:
 */
//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
