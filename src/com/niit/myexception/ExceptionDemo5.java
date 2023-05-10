package com.niit.myexception;

public class ExceptionDemo5 {
    public static void main(String[] args) {

        //如果try中出现了问题，try语句块中其他的代码还会执行吗

        //下面的代码不会执行，直接跳转到对应的catch当中，执行catch中的与具体
        //如果没有对应catch与之对应，那么还是会交给虚拟机进行默认处理

        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
            System.out.println("是否执行");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组索引越界");
        }
    }
}
