package com.gyanaranjan.Java8Nwp01;

import java.util.Arrays;

public class ArrayIncreaseAtCetainPoint {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int index = 2;
        for(int i =0;i< arr.length-1;i++){
            if(arr[i]>=arr[2]){
                arr[i]=arr[i+1];
            }

        }
        arr[arr.length - 1]=-1;
        System.out.println(Arrays.toString(arr));
    }

}
