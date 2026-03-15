package com.gyanaranjan.ArrayProgram01;

import java.util.Arrays;
import java.util.List;

//Q. Write a code in Java 8 to Print Strings whose length is greater than 3 in List.
//        I/P - sky, red, blue, yellow
//        O/P - blue, yellow
public class Java8Program {
    public static void main( String[] args ){
        List<String> str = Arrays.asList("sky", "red", "blue", "yellow");
        List<String> list = str.stream().filter(s -> s.length() > 3).toList();
        System.out.println(list);


    }
}
