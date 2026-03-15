package com.gyanaranjan.Java8Nwp01;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFeature {


    public static void main(String[] args) {
       // Stream.nullable
        List<String> list = Arrays.asList(null, "hii", "jii","hello", "rabi", "book");
//        List<Integer> collect = list.stream().filter(n->n!=null).map(String::length)
//                .collect(Collectors.toList()); 
       List <String> collect=list.stream().flatMap(Stream::ofNullable)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
