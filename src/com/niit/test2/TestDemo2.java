package com.niit.test2;

import com.niit.test.GrilFriend;

import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        com.niit.test.GrilFriend gf= new GrilFriend();
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
            }catch (NameFormatException e){
                System.out.println("姓名格式错误，请重新录入");
                continue;
            }catch (AgeOutOfBoundsException e){
                System.out.println("年龄不在合法范围，请重新录入");
                continue;
            }
        }

        System.out.println(gf);

    }
}
