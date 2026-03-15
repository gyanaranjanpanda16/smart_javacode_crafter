package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.stream.Stream;

public class LimitAndSkipJava8 {
    public static void main(String[] args) {
//        Stream.of(1,5,6,9,10).skip(2).forEach(System.out::println);
        Stream.of(1,5,6,9,10).limit(3).forEach(System.out::println);




    }
}
