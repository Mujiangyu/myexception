package com.niit.test;

import com.niit.test2.AgeOutOfBoundsException;
import com.niit.test2.NameFormatException;

public class GrilFriend {
    private String name;
    private int age;

    public GrilFriend() {
    }

    public GrilFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        int len = name.length();
        if(len<3||len>10){
            throw new NameFormatException();
        }
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if(age<18||age>40){
            throw new AgeOutOfBoundsException();
        }
        this.age = age;
    }

    public String toString() {
        return "GrilFriend{name = " + name + ", age = " + age + "}";
    }
}
