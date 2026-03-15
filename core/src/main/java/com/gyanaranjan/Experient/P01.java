package com.gyanaranjan.Experient;

public class P01 {

    String add(String name){
        var a = "rintu" +" " +name;
//        System.out.println(name+a);
        return  a;
    }

    public static void main(String[] args) {
        P01 p01 = new P01();
        System.out.println(p01.add("panda"));

    }
}
