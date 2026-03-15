package com.gyanaranjan.CheckJavaConcept;

public class Nw01 {
    public static void main(String[] args) {
//         double a = 1.0;
//         double b = 0.0;
//         System.out.println(a/b +"  " + b/a);//Infinity  0.0
         int c = 1;
         String str = "rintu";
         int d = 0 ;
//        System.out.println(d/Integer.parseInt( str));
        System.out.println(d/c);
        try {
            System.out.println(c / d);
        } catch (ArithmeticException e){
//            System.out.println("caught");
        }
        finally {

        }
        byte a = 1;
        byte b = 0;
//        System.out.println(a/b +"  " + b/a);
        System.out.println("-------------");


    }
}
