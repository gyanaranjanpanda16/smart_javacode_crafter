package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class SwapTwoNumber {
    public static void main(String[] args) {
        // swapping the value :--->
        int a = 10;
        int b = 20;
        System.out.println(a+"  :   "+b);
        System.out.println("After value swapped :-->");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"  :   "+b);

    }
}
