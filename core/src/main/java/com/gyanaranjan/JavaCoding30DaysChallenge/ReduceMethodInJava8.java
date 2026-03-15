package com.gyanaranjan.JavaCoding30DaysChallenge;

import java.util.Arrays;
import java.util.List;

public class ReduceMethodInJava8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("i", "am", "a", "good", "java", "developer");
        String str = list.stream().reduce("", String::concat);
        StringBuilder builder = new StringBuilder();
        list.forEach(builder::append);
        System.out.println(builder);
        System.out.println("=========Reduce for String ================");
        System.out.println(str);

    }
}
