package com.gyanaranjan.DSAProgram2026;

public class Array2Pointer {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]==arr[mid+1]){
                left=mid+1;
            }
            left++;
            right--;
        }
    }
}
