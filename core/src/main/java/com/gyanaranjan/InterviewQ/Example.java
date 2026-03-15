package com.gyanaranjan.InterviewQ;
//Find highest frequent character in a string

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
     String str = "hiiiamgoodinjava";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // character occurrence  frequency :-
        System.out.println(collect);


        // Find the maximum frequency
        long maxFrequency = 0;
        for (Map.Entry<Character, Long> entry : collect.entrySet()) {
            long frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Find the character(s) with the maximum frequency
        System.out.println("Highest frequent character(s):");
        for (Map.Entry<Character, Long> entry : collect.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
        }

}