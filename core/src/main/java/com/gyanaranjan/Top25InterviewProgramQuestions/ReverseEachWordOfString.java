package com.gyanaranjan.Top25InterviewProgramQuestions;

import java.util.Arrays;
import java.util.List;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String input = "hewhsf  nhfsjkfjs  jfjsfk  sj";
        String[] strArr=input.split(" ");
//        System.out.println(Arrays.toString(strArr));
        List<String> list = Arrays.stream(strArr).map(w-> new StringBuilder(w).reverse()
                .toString()).toList();
       System.out.println(list);
    }
}
