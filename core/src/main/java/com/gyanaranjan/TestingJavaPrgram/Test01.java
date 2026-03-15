package com.gyanaranjan.TestingJavaPrgram;

public class Test01 {
    static void  m1(){
        System.out.println("m1() static ---> ");
        new Test01().m2().m3();
    }
    Test01 m2(){
        System.out.println("Non static m2() ---> ");
        System.out.println(this);
        return this;
    }
    Test01 m3(){
        System.out.println("Non static m3() ---> ");
        return this;
    }


    public static void main(String[] args) {
        System.out.println("main method --->");
        m1();
    }


}
