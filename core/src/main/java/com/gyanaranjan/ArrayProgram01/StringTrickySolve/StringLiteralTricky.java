package com.gyanaranjan.ArrayProgram01.StringTrickySolve;

public class StringLiteralTricky {
    public static void main(String[] args) {
        String s1 ="Hello";
        String s3 ;
        StringBuilder builder = new StringBuilder("hello");
        builder.append("world");
        System.out.println(builder);
        String s = new String("hello");
        s3=s.concat("world");
        System.out.println(s);
        System.out.println("++++++++++++++");
        System.out.println(s3);
        s1= s1+"world";
//        s+"worldbank";

//        String s2 ="hello";
//        String s3 ="hello";
//        String s4 =new String("Hello");
        System.out.println(s1);
//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        System.out.println(s1==s4);
//        System.out.println(s1.equals(s4));

    }
}
