package com.gyanaranjan.ArrayProgram01;

import java.util.Arrays;
class ReplaceArrayElement {
     public static void main(String[] args) {
//         int [] arr = {10,20,30,40,50,60,70,80};
//         int target = 30; //o/p --> [10,20,40,50,60,70,80,-1]
                 int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
                 int target = 2;
                 for (int i = 0; i < arr.length - 1; i++) {
                     if (i>=target) {
                         arr[i] = arr[i + 1];
                     }
                 }
                 arr[arr.length - 1] = -1;
                 System.out.println(Arrays.toString(arr));
             }
         }









