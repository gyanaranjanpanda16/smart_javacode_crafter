package com.gyanaranjan.JavaCoding30DaysChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindFindFirstName {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Gyana Panda", "Soumya das", "Rahul khonde",
                "Laxmikanta samal");
        Stream<String> stringStream = list.stream().map(s -> s.split("\\s+")[1]);
        System.out.println("Given Full Name to find First Name are :-");
        stringStream.forEach(System.out::println);
    }
}
