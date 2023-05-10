package com.niit.myexception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //如果try中可能会遇到多个问题，该怎么执行
        //如果try中有多个异常，我们要用catch语句将其全部捕获，
        //如果这些异常存在父子关系的话，Exception一定要写在最下方，或者最后
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(2 / 0);
            System.out.println(arr[10]);
            String s =null;
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            System.out.println("出现了多个问题");
        }
        System.out.println("是否执行");
    }
}
