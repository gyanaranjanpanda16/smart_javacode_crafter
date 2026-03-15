package com.gyanaranjan.Java8Nwp01;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class FindAverageOfAListOfANumber {
    public static void main(String[] args) {
        double average = Stream.of(2, 5, 7, 8, 9, 34, 6, 7, 18)
                .mapToInt(Integer::intValue).average().getAsDouble();
        String result = String.format("%.2f", average);
        System.out.println(result);
    }
}
