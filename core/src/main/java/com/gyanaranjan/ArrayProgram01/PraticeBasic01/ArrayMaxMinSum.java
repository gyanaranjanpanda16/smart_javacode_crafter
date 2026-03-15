package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

public class ArrayMaxMinSum {
    // max and min element in Array :-
    int[] findMaxAndMinArr(int[] arr){
        int max =arr[0];
        int min =arr[0];
        int i =0;
        while (i<arr.length) {
            if(max<arr[i]){
               max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            i++;
        }
        return new int[]{max,min};
    }

    // Sum of Given Array :->
     int arraySum(int [] arr){
         int sum =0;
         for (int j : arr) {
             sum += j;
         }
         return sum;
     }
    public static void main(String[] args) {
        int [] arr = {1,6,7,8,9};
        ArrayMaxMinSum arrayMaxMinSum = new ArrayMaxMinSum();
        int sum = arrayMaxMinSum.arraySum(arr);
        int[] maxAndMinArr = arrayMaxMinSum.findMaxAndMinArr(arr);
        System.out.println("Sum of Array : "+sum);
        System.out.println("Max = " + maxAndMinArr[0] + ", Min = " + maxAndMinArr[1]);

    }
}
