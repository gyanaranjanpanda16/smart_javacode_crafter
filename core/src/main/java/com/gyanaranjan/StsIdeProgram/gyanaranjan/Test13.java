package com.gyanaranjan.StsIdeProgram.gyanaranjan;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test13 {
    public static void main(String[] args) {
        // find frequence of character :->
        int[] arr = {1, 4, 77, 89, 99, 99, 88, 77, 1};
        String str = "hiiamagoodjavadeveloper";
        // in java 8 ways :-
//        Map<Integer, Long> collect = Arrays.stream(arr).mapToObj(n -> (Integer) n).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);
//        Map<Character, Long> collect1 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect1);
        // normal way :=>
//        Map<Character,Integer> count = new LinkedHashMap<>();
//        char[] c = str.toCharArray();
//        for(char i :c){
//            if(count.containsKey(i)){
//                count.put(i,count.get(i)+1);
//            }else{
//                count.put(i,1);
//            }
//        }
//        System.out.println(count);
//    }
    }

}
