package com.gyanaranjan.Top25InterviewProgramQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFrequencyOfEachCharacterInString {
    public static void main(String[] args) {
        String str = "gyanaranjan";
        int [] arr = {20,50,60,50,80};
//        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> collect =Arrays.stream(arr).map(c -> (Integer) c).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k,v)-> System.out.print((k +" : "+v+" ")));
    }
}
