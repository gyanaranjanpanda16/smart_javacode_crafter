package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindHighestFrequencyChar {
    public static void main(String[] args) {
     String str = "hii my name is gyanaranjan";
        String s = str.replaceAll("\\s+", "");
        Map<Character,Long> collect = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        Character highestChar = collect.entrySet().stream().max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey).orElse('\0');
//        System.out.println(highestChar+" :"+collect.get());
        Optional<Map.Entry<Character, Long>> maxEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue());
        if(maxEntry.isPresent()){
            Map.Entry<Character, Long> characterLongEntry = maxEntry.get();
            System.out.println("Character : "+characterLongEntry.getKey()+", Frequency : "+characterLongEntry.getValue());
        }else{
            System.out.println("Not Present Max Character :");
        }

    }
}
