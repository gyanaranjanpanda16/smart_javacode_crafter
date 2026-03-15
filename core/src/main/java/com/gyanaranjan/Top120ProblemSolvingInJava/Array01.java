package com.gyanaranjan.Top120ProblemSolvingInJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Array01 {
    public static void main(String[] args) {
        // store  multiple values of same type under single variable = Array , Array symbol : []
     int [] numbers = new int[5]; // through new keyword
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[4]);
        int [] num={4,5,1,12,3};
        int [] num1= new int[num.length];
//        for(int i=0;i<num.length;i++){
//           num1[i]=num[i];
//        }
        System.arraycopy(num,0,num1,0,num.length);
        System.out.println(" Num : "+Arrays.toString(num));
        System.out.println("-------------------------");
        Arrays.sort(num1);
        System.out.println(Arrays.equals(num,num1));
        Arrays.stream(num).forEach(System.out::println);
        for(int x : num1) {
            System.out.println(" Num1 : " + x);
        }
        System.out.println("------------Arrays sum which Start with 1 :-----------------");
        int sum = Arrays.stream(num1).filter(n -> String.valueOf(n).startsWith("1")).sum();
        System.out.println("Sum is :-  " +sum);
        System.out.println("Create a Array :--------------");
        int [] arr = IntStream.rangeClosed(1,5).toArray();
        System.out.println(Arrays.toString(arr));
        // Binary-Search of Array :-->
        System.out.println("------------Binary-Search of Array ------------------");
        int [] search = {2,5,6,78,8,89,76};
        int i = Arrays.binarySearch(search, 78);
        System.out.println("Index is :-> "+i);
        System.out.println("-----------Arrays  Copy Of Range :-------");
        int[] ints = Arrays.copyOfRange(search, 2, 5);
        System.out.println(Arrays.toString(ints));
        System.out.println("------------Array Spliterator -----------------");
        Long [] spilt = {1L,2L,3L,5L,6L,7L};
        Arrays.spliterator(spilt).forEachRemaining(System.out::println);
        System.out.println("----------Custom Sorting Order ----------");
        Person[] p= {new Person("Rahul",35),new Person("Gyana",25)};
        Arrays.sort(p, Comparator.comparing(Person::getAge));
        System.out.println(Arrays.toString(p));
        System.out.println("Combine Arrays With Stream and (Flat Map) :--");
        int [][] matrix ={{1,2},{3,4},{5,6}};
        System.out.println(Arrays.toString(Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream).toArray()));
    }
}
