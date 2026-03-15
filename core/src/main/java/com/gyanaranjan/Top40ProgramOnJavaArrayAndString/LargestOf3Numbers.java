package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        int a =35;
        int b=30;
        int c =100;
        int max = (a > b && a > c) ? a : (b > c && b > a) ? b : c ;
        System.out.println(max);

    }
}
