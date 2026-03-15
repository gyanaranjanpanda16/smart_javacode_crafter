package com.gyanaranjan.DurgaSirNotePrograms;

import java.util.Arrays;

public class P03 {

    static  int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int arr1 =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] % 2 != 0) {
                result[arr1]=arr[i];
                arr1++;
            }
        }
        return  result;
    }

    public P03(int[] arr) {
        String string = Arrays.toString(removeEven(arr));
        System.out.println(string);
    }

    public static void main(String[] args) {
        P03 p03 = new P03(new int[]{1, 3, 5, 6, 7, 8, 98, 9, 10});
    }
}
