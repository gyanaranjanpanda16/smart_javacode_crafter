package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;

public class SumOfEvenArrayIndex {
    public static void main(String[] args) {
        int []  arr = {1,5,6,10,9,8}; // o/p will be :- 24
        int sum = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();
        System.out.println(sum);
    }
}
