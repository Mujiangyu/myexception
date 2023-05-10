package com.niit.exceptionmethod;

public class MethodDemo1 {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
           /* String message = e.getMessage();
            System.out.println(message);*/

          /*  String s = e.toString();
            System.out.println(s);*/

            e.printStackTrace();//仅仅是打印错误信息，不会停止程序运行············
        }


        System.out.println("是否执行");
    }
}
