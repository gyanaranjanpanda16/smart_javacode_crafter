package com.gyanaranjan.DsaProgram.ArrayQuestions;

import java.util.HashSet;
import java.util.Set;

public class ArrayMaxMinUsingDsa {
    public static void main(String[] args) {
        int [] arr = {45,6,8,10,86,5,1,6,5,67,85,0};
        //Q1 :- find Max and Min in Given Array :-
        //Q2 :- find Duplicate Element in Array
        //Q3 :- find second Max :-
        int max =0;
        int min =arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max Element in given Array "+max);
        System.out.println("Min Element in given Array "+min);
        System.out.println("--------------------------------------");
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int x :arr){
            if(!set1.add(x)){
                set2.add(x);
            }
        }
        System.out.println("Duplicate Element in Given Arrray "+set2);
        System.out.println("---------------------------------------");
        int max1 = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second Max is Given Array is : "+secondMax);
    }
}
