package com.gyanaranjan.JavaCoding30DaysChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Example {
    public static void main(String[] args) {
        int[] numbers = {4, 16, 256};

        List<Double> array = Arrays.stream(numbers).mapToDouble(Math::sqrt).boxed().collect(Collectors.toList());
        System.out.println(array);

    }
}
