package com.gyanaranjan.InterviewQ;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HigestCharacterCountWithNumberOfTimes {
    public static void main(String[] args) {
        String str = "hGoojkjjjjkodQuesion";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<Character, Long> characterLongEntry = collect.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElse(null);
        System.out.print("higest character is :    "+
                characterLongEntry.getKey()+"  :   No of times is "+ characterLongEntry.getValue());
    }
}
