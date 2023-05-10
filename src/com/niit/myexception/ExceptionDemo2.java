package com.niit.myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //如果try中没有遇到问题，该怎么执行? :如果try中没有问题，会把try中的语句全部执行完毕，catch中的语句不会执行



        int[] arr = {1, 2, 3, 4, 5};
        try{
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组索引越界");
        }
        System.out.println("是否执行");
    }
}
