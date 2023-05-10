package com.niit.test2;

public class NameFormatException extends RuntimeException{
    //NameFormat表示异常的名字
    //Exception表示当前类是一个异常类

    //运行时异常要继承runtimeException   由于参数异常而导致的问题
    //编译时异常要继承Exception  核心是提醒程序员检查本地信息

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
