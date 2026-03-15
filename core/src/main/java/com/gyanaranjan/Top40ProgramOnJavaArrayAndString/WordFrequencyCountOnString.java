package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCountOnString {
    public static void main(String[] args) {
        String str = "hello its my sad story its my java story";
        String[] s = str.split(" ");
        Map<String, Long> collect = Arrays.stream(s).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));
//        collect.forEach((k,v)-> System.out.println(k+"  "+v));
        System.out.println(collect);
        Map<String , Integer> wordCount = new HashMap<>();
        for(String word:s){
           wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        System.out.println(wordCount);

    }
}
