package com.gyanaranjan.ArrayProgram01;

import java.util.Arrays;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
       int [] numbers = {10,20,20,30,30,5,15};
//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-2]);
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;
       for(int i =0; i< numbers.length;i++){
           if(numbers[i]>max){
             secondMax=max;
             max=numbers[i];
           }else if (numbers[i]>secondMax&&numbers[i]!=max){
               secondMax=numbers[i];
           }
       }
        System.out.println("Second Largest element : "+secondMax);
    }
}
