package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author: zhang
 * @date: 2022/3/6
 * @description:
 */
public class People {

    @Resource(name = "dog222")
    private Dog dog;

    @Resource
    private Cat cat;
    private String name;

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }
}
