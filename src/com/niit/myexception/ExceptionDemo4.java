package com.niit.myexception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        //如果try中的问题没有被捕获，该怎么执行

        //try...catch中的代码没有作用，最终还是会交给虚拟机进行默认处理

        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[10]); //new ArrayIndexOutofBoundsException,并与catch语句中的异常进行比较
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }
        System.out.println("是否执行");
    }
}
