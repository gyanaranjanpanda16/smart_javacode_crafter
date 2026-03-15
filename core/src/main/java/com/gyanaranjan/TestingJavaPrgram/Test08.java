package com.gyanaranjan.TestingJavaPrgram;

public class Test08 {
    int x =10;
    int y =10;
    static void m33() {
        System.out.println("static");
        new Test08().m34();
        System.exit(0);
//        Thread.sleep(9);
    }
    void m34(){
        Test08.m33();
        System.out.println("Non static");
    }



    void m1(Test08 e){
        System.out.println("m1() ------>");
        System.out.println(e);
        Test08 test08 = new Test08();
        System.out.println(test08);
    }

    public static void main(String[] args) {
        Test08 test08 = new Test08();
        test08.m34();
        System.out.println(test08);
        Test08 test09 = new Test08();
        System.out.println(test09);
        test08.m1(test08);
    }

}
