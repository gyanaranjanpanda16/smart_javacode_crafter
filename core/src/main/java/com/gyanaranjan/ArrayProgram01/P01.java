package com.gyanaranjan.ArrayProgram01;

import java.util.Arrays;

public class P01 {
    void arrReplace(int [] arr,int target) {
        int n =4;
        for (int i = 0; i < arr.length-1; i++) {
            if (i ==n) {
                arr[i] = arr[i + 1];
                n++;
            }
        }
                     arr[arr.length-1]=-1;
    }
    String arrResult(int[] arr, int target, int setValue) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = setValue;
                b = true;
            }
        }
        if (b) {
            return " Set Data Successfully ";
        }
        return "Target Value Not found  ";
    }

    public static void main(String[] args) {
        int[] array = {8, 8, 7, 9, 5, 10, 5};   // condition :- 0 replace by  5;
        int[] array1 = {0,1,2,3,4,5}; // condition :- remove 5 next element replace at last -1;
        P01 p01 = new P01();
        System.out.println(p01.arrResult(array, 0, 5));
        System.out.println(Arrays.toString(array));
        p01.arrReplace(array1,5);
        System.out.println(Arrays.toString(array1));
    }
}
