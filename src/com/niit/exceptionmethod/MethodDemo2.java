package com.niit.exceptionmethod;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] arr =null; /*{1,2,3,446,65};*/
        int res = 0;
        try {
            res = getMax(arr);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println(res);
    }
    public static int getMax(int[] arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
        if (arr == null) {
            //手动创建一个异常对象，并把这个对象交给方法的调用这处理
            //此时方法就会结束，下面的代码就都不会执行了
            throw new NullPointerException();
        }
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
