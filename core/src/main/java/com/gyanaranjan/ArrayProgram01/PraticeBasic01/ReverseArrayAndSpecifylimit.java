package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

import java.util.Arrays;

//Reverse Array :-
public class ReverseArrayAndSpecifylimit {
    void reverseArray(int[] arr){
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
    // Reverse Array with specify  limit :-
    void reverseArray(int[] arr,int start,int end){
//        int start = a;
//        int end = b;
        while(start<end){
            int temp =  arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr= {1,6,8,9,0,7,6,10};
        ReverseArrayAndSpecifylimit reverseArrayAndSpecifylimit = new ReverseArrayAndSpecifylimit();
//        reverseArrayAndSpecifylimit.reverseArray(arr);
        reverseArrayAndSpecifylimit.reverseArray(arr,5,7);
        System.out.println(Arrays.toString(arr));

    }
}
