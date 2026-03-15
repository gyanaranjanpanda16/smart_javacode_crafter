package com.gyanaranjan.PraticeCode;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class A16 {
    public static void main(String[] args) {
        double findDouble = Stream.of(5.5, 6.2, 3.8, 7.1, 4.9).filter(n -> n % 2 == 0)
                .mapToDouble(Double::doubleValue).average().orElse(0.00);
        System.out.println(findDouble);
    }
}
