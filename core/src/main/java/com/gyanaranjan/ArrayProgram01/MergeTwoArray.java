package com.gyanaranjan.ArrayProgram01;
import java.util.Arrays;
class MergeTwoArray {
     public static void main(String[] args) {
         int [] arr1 = {1,2,3};
         int [] arr2 = {8,9,10,11,12,13}; // array output will be required o/p :-> {1,2,3,4,5,6,7,8,9,10} .
         int [] mergearr= new int[arr1.length+ arr2.length];
         int mergearrlength=arr1.length+ arr2.length;
         int count=0;
         for(int i =0;i<mergearrlength;i++){
             if(i<arr1.length) {
                 mergearr[i] = arr1[i];
             } else  {
                mergearr[i]=arr2[count];
                count++;
             }
         }
         System.out.println(Arrays.toString(mergearr));
     }
}
