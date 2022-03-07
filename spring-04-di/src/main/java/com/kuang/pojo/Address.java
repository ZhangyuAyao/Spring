package com.kuang.pojo;

import java.util.*;

/**
 * @author: zhang
 * @date: 2022/3/5
 * @description:
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
