package com.gyanaranjan.Java8Nwp01;

import java.util.List;
import java.util.stream.Stream;

public class TransformStringToUppercase {
    public static void main(String[] args) {
        // upper case :--
        List<String> list = Stream.of("hello", "rintu", "ram", "siya", "rahul")
                .map(String::toUpperCase)
                .toList();
        List<Integer> list1 = Stream.of("hello", "rintu", "ram", "siya", "rahul").map(String::length).toList();
        System.out.println("Result :-" +list);
        System.out.println("Result :-" +list1);
    }
}
