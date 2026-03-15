package com.gyanaranjan.NewJava8ProgramCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Java8BasicProgram {
    public static void main(String[] args) {
        // Create a list for data feed to Stream or lambda
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(8);
        numbers.add(6);
        numbers.add(9);
//        System.out.println(numbers);  // list print
//        String collect = Stream.of(1, 3, 8, 6, 9).map(Object::toString)
//                .collect(Collectors.joining(", ", "[", "]")); // another same list
//                                                                                 //print
//        System.out.println(collect);
//        Example 1: Print each element in the list

//        numbers.stream().forEach(System.out::print);
//        print Even number in list
//        int [] numbers = {1,3,45,6,89,778,8};
//        int[] array = stream(numbers).filter(n -> n % 2 == 0).toArray();
//        System.out.println(Arrays.toString(array));

//        List<Integer> list = Stream.of(1, 3, 45, 6, 89, 778, 8).filter(n -> n % 2 == 0).toList();
//        Object[] array = Stream.of(1, 3, 45, 6, 89, 778, 8).filter(n -> n % 2 == 0).toArray();
//        System.out.println(list);
//        System.out.println(Arrays.toString(array));
//        Example 3: Perform an operation on each element and collect results

//        List<Integer> list = numbers.stream().map(n -> n + 5).map(n->n-5).toList();
//        System.out.println(list);
//        System.out.println(numbers);

//        Integer reduce = numbers.stream().reduce(0, Integer::sum);
//        Integer reduce = numbers.stream().reduce(0, (a,b)->a+b);
//        Integer reduce = numbers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(reduce);
        // Ex-04: Find out Max or Min value in given List :-
        System.out.println(numbers);
//        Integer max = numbers.stream().max(Integer::compareTo).get();
//        System.out.println("Max Number is "+max);
//        Integer min = numbers.stream().min(Integer::compareTo).get();
//        System.out.println("Min Number is  "+min);
        // Ex-05 print all odd number present in list :-
        List<Integer> list = numbers.stream().filter(n -> n % 2 != 0).toList();
        System.out.println(list);


    }
}
