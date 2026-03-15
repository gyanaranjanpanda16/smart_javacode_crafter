package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class ReverseNumberInJava {
    public static void main(String[] args) {
        int a = 1234; // o/p will be 4321.
        //using String way :--->
//        String s = String.valueOf(a);
//        StringBuilder builder = new StringBuilder(s);
//        System.out.println(builder.reverse());
        // using algorithm way :-
        int rev =0;
        while (a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        System.out.println("reverse number is :- "+rev);
    }
}
