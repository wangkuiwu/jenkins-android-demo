package com.skw.hello;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        obj.plus(2, 4);
    }

    public int plus(int a, int b) {
        int ret = a+b;
        System.out.printf("Plus: %d+%d=%d\n", a, b, ret);
        return ret;
    }
}
