package com.gyanaranjan.StsIdeProgram.gyanaranjan;


public class Test09 {
   
    Test09() {
        System.out.println("Parent class Constructor:");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
    int i = 10;
    int j = 20;

    {
        System.out.println("First instance block");
    }


    public static void main(String[] args) {
//        Test09 t = new Test09();
        System.out.println("main Method");
    }
}
