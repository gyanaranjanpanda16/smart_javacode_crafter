package com.gyanaranjan.PraticeCode;

public class A1 {
    void print(){
        System.out.println("hello");
    }
    void play(){
        System.out.println("hii");
        print();
    }
    public static void main(String[] args) {
        new A1().play();
    }
}
