package com.gyanaranjan.Top120ProblemSolvingInJava;

import java.util.Arrays;

public class CheckOutPut {
    public static void main(String[] args) {
        String [] stringsArray = {"one","two","three"};
        var stringsList = Arrays.asList(stringsArray);
        System.out.println(stringsList);
        int [] intsArray = {1,2,3};
        var intsList = Arrays.asList(stringsArray);
        System.out.println(intsArray);
        System.out.println(stringsList.contains("one")+",");
        System.out.println(intsList.contains(1));
    }
}
