package com.gyanaranjan.PraticeCode;

 class A03 {
     public static int sum(int[] x){
         int total =0;
         for(int x1:x){
            total+=x1;
         }
         return total;
     }

     public static void main(String[] args) {
         System.out.println(sum(new int[]{1,4,6,8,9,0,3,2}));

     }
}
