package com.gyanaranjan.dsa.Array;

public class ReverseArray {

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp =  arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }




    public static void main(String[] args) {

    }
}
