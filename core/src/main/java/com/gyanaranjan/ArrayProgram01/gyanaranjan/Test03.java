package com.gyanaranjan.ArrayProgram01.gyanaranjan;

public class Test03 {
    int b=10;
    String str = "gyanaranjan";
    static  int a =10;
    static void add(){

        System.out.println("static method ");
    }
   static {
        add();
       System.out.println("static block");
   }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        System.out.println("Main method ");
        Test03.a=40;
        test03.str = "panda" +"gyana";
        test03.str= "yourname";
        String a = "a";
        String a1 = a;
        System.out.println(a);
        System.out.println(test03.str);
        System.out.println(Test03.a);
        test03.b=35;
        System.out.println(test03.b);
    }
}
