package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Arrays;

public class Check2ArraysAreEqualorNot {
    public static void main(String[] args) {
        int [] arr = {1,3,7,89,90};
        int [] arr1 = {9,3,90,1,89};
        // Using Array Approach :--->
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)){
            System.out.println("Both Array is Equal ");
        }else{
            System.out.println("Both Array is Not-Equal ");
        }
        // using  Data Algorithm Approach :--->
        boolean status = true; // flag
        if(arr.length== arr1.length){
            for(int i=0;i< arr.length;i++){
                if(arr[i]!=arr1[i]){
                    status=false;
                }
            }
        }else{
            status=false;
        }
        if(status==true){
            System.out.println("Arrays are Equal ");
        }else{
            System.out.println("Arrays are Not Equal ");
        }
    }
}
