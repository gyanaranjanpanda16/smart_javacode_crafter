package com.gyanaranjan.Java8Nwp01;

import java.util.stream.IntStream;

public class SumOfEvenNumberFrom1to10 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).sum();
        System.out.println("Sum of even numbers from 1 to 10 :--> "+sum);
    }
}
