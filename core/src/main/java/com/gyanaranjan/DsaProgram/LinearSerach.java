package com.gyanaranjan.DsaProgram;

import java.util.Arrays;


public class LinearSerach {
    //    Searching in Array :--->
    public static int linerSearch(int[] arr,int key){
        for(int i =0;i< arr.length;i++){
            if (arr[i]==key) {
                return i+1;
            }
        }
        return -1;
    }
    //Remove index value at last put -1 ---->
    public static int[] arrRemove(int[]arr ,int key1){
        for (int i = 0;i<arr.length-1;i++){
//            System.out.println(i);
            if(i>key1){
                arr[i]=arr[i+1];
            }
        };
        arr[arr.length-1]=-1;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int key =200 ;
        int key1=4;
        System.out.println(linerSearch(arr,key));
        System.out.println(Arrays.toString(arrRemove(arr,key1)));
    }
}
