package com.gyanaranjan.Hundred100QuestionsONJAVA8;


import java.util.function.BiFunction;
import java.util.function.Function;

public class P06 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        Function<Integer, Integer> multipication = (a) -> a * a;
        int result = multiply.apply(3, 5);
        int result1 = multipication.apply(5);
        System.out.println("Result: " + result); // Output: 15
        System.out.println("Result: " + result1); // Output: 25
    }
}
