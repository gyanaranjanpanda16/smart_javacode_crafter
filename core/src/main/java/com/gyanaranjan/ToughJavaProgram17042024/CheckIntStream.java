package com.gyanaranjan.ToughJavaProgram17042024;

import java.util.stream.IntStream;

public class CheckIntStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(System.out::println);
    }
}
