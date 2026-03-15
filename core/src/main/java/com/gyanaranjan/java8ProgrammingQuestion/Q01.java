package com.gyanaranjan.java8ProgrammingQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Stream;

//1)1) Write a program that takes a list of strings and
//     filters out the strings starting with the letter 'a' .
public class Q01 {
    public static void main(String[] args) {
        String[] str = {"gyana","ramesh","panda","apple"};
        Integer[] arr = {10,40,56,78,9,5};
     Integer stream = Arrays.stream(arr).

                filter(n -> n % 2 != 0) // Filter out odd numbers
                .map(n -> n * 2).sorted(new Comparator<Integer> () {
                   @Override
                   public int compare(Integer o1, Integer o2) {
                       return -o1.compareTo(02);
                   }
               })          // Double the remaining numbers
               .reduce(0,Integer::sum); // Print each element
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double averageOfEvenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0) // Filter even numbers
                .average()
                .orElse(Double.NaN);
        System.out.println(averageOfEvenNumbers);
        System.out.println(stream);
        Arrays.asList(str).stream().filter(n->n.toLowerCase().startsWith("a")).
                map(String::toUpperCase).forEach(System.out::println);





    }
}
