package com.gyanaranjan.PraticeCode;

import java.util.Arrays;
import java.util.List;

//Q. Write a code in Java 8 to Print Strings whose length is greater than 3 in List.
//        I/P - sky, red, blue, yellow
//        O/P - blue, yellow
public class A07 {
    public static void main(String[] args) {
        String [] str = {"sky", "red", "blue", "yellow"};

        // ONE-WAY :--->
//        List<String> listColor = new ArrayList<>();
//        for(String color :str){
//            if(color.length()>3){
//                listColor.add(color);
//            }
//        }
//        System.out.println("Total available color whose  length is greater than 3 are "
//                +listColor.size() +" these are :-"+listColor);
        // TWO-WAY :--->
        List<String> list = Arrays.stream(str).filter(s -> s.length() > 3).toList();
        System.out.println(list);


    }
}
