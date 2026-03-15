package com.gyanaranjan.DsaProgram;

 class linearSearch {
     public static void main(String[] args) {
         int [] arr = { 10,20,30,40,50,60,70};
         int target = 80 ; //return index of that target positions .
         for(int i = 0; i<arr.length; i++){
             //boolean a = false;

             if(arr[i]==target){
                 System.out.println("Target Found : "+( i+1) + "at the position");
                 //a = true;
                 break;
             }if (i== arr.length-1) {
                 System.out.println("Target Not Found ");
             }

         }









     }
 }
