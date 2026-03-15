package com.gyanaranjan.Java8ConceptProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import  java.util.stream.IntStream;
public class CharacterSequence {
    public static void main(String[] args) {
        String s = "GYANARAJANPANDA";

//        IntStream Is = s.chars();
//        System.out.println(Is);
//        Stream<Character> objectStream = Is.mapToObj(c ->(char)c);
//        Map<Character, Long> collect = objectStream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);
        Map<Character, Long> collect = s.chars().mapToObj((c -> (char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Iterator<Map.Entry<Character, Long>> iterator = collect.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Long> entry = iterator.next();
            System.out.println("key is  "+entry.getKey()+"      value are "+entry.getValue());
        }

    }
}
