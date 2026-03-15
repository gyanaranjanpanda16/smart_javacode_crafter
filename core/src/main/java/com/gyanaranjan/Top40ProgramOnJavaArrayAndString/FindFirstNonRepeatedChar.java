package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        // Normal way using index of ==  last index of 
      String  st1= "welcolwleo"; // output : c
        char[] charArray = st1.toCharArray();
        for(Character c :charArray){
            if(st1.indexOf(c)==st1.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
        }
       // using Java 8 ways ::--
        Character c1 = st1.chars().mapToObj(c -> (char) c).collect(Collectors
                        .groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey)
                .findFirst().orElse('\0');

        System.out.println(c1);
    }
}
