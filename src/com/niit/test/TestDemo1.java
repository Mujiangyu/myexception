package com.niit.test;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GrilFriend gf= new GrilFriend();
        while (true) {
            try {
                System.out.println("输入姓名:");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("输入年龄:");
                String age = sc.nextLine();
                gf.setAge(Integer.parseInt(age));
                //所有数据正确，跳出循环
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请重新输入正确格式");
                continue;
            }catch (RuntimeException e){
                System.out.println("姓名的长度或者年龄的范围有误，请重新录入");
                continue;
            }
        }

        System.out.println(gf);

    }
}
