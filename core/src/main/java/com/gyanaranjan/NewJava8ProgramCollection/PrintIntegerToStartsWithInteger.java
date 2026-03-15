package com.gyanaranjan.NewJava8ProgramCollection;

import java.util.Arrays;
import java.util.List;

public class PrintIntegerToStartsWithInteger {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<Character> myList1 = Arrays.asList('a','b','c','d','e','f');
        List<String> myList2 = Arrays.asList("apple","banana","jelly","jammu","guva");

        List<Integer> list = myList.stream().filter(n -> String.valueOf(n).startsWith("1")).toList();
        List<Character> myChar = myList1.stream().filter(n -> String.valueOf(n).startsWith("f")).toList();
        List<String> myString = myList2.stream().filter(n -> n.startsWith("a")).toList();
        System.out.println(myString);

    }

}
