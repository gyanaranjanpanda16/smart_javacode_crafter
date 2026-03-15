package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpilteratorAndIteraratorWithCollectorsJoining {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hii");
        strList.add("hello");
        strList.add("rintu");
        strList.add("ram");
        strList.add("hari");
//        Spliterator<String> spliterator = strList.spliterator();
//        Iterator01<String> iterator = strList.iterator();
//        spliterator.forEachRemaining(System.out::println);
//        iterator.forEachRemaining(System.out::println);
//        String collect = strList.stream().collect(Collectors.joining("=+=", "[", "]"));
        String collect = strList.stream().collect(Collectors.joining(" , "));
        System.out.println(collect);

    }
}
