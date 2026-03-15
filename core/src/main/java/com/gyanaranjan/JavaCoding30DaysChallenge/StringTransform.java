package com.gyanaranjan.JavaCoding30DaysChallenge;

public class StringTransform {
    public static void main(String[] args) {
        String str = "hello";
//        String indent = str.indent(45);
//        System.out.println(indent);
        String transform = str.transform(s -> new StringBuilder(s).reverse().toString());
        System.out.println(transform);
        String str1= """
                hii
                its 
                my
                java code \n
                and i am 
                good in 
                java 
                """;
        System.out.println(str1);
    }
}
