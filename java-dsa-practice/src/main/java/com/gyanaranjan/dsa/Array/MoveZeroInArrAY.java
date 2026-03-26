package com.gyanaranjan.dsa.Array;

import java.util.Arrays;

public class MoveZeroInArrAY {
    public static int[] moveZeroes(int[]arr){
        int left=0;
        for(int right =0;right<arr.length ;right++){
            if(arr[right] !=0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5}; //{1,3,5,0,0}
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
}
