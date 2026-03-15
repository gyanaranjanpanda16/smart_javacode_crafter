package com.gyanaranjan.InterviewQ;

import java.util.Arrays;

//An array has few integers between 1 and 10. Print the missing integers
public class Example02 {
//    public static int findMissingNum(int[] arr){
//        int n = arr.length+1;
//        int total = n*(n+1)/2;
//        int sum = Arrays.stream(arr).sum();
//        return total-sum;
//
//    }
      public static  int[] findFewMissingNum(int[] arr){
          int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
//          int compare = Arrays.compare(arr1,arr);
//          Arrays.stream(arr).
          int [] arr2 = new int[2];
          for(int i=0; i<arr.length;i++){
              for (int j=i;j<arr1.length;j++){
                  if(arr1[i]!=arr1[i]){
                      arr2[i]=arr1[i];
                  }
              }
          }

          return arr2;
      }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,7,8,9,10}; // 5,6 missing
        System.out.println(Arrays.toString(findFewMissingNum(arr)));
    }
}
