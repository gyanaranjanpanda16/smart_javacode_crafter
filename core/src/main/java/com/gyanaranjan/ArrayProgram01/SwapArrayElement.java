package com.gyanaranjan.ArrayProgram01;
// left - rotation Array :-->
 class SwapArrayElement {
  public static void main(String[] args) {
      int [] arr1 = { 1,2,3,4,5,6,7,8};
      int [] swaparr = new int[arr1.length];
      int number = 5 ;
      for(int i=0; i< arr1.length;i++){
          int rotation = (i+number)% arr1.length;
          swaparr[rotation]=arr1[i];
      }
      for(int a:swaparr){
          System.out.print(a + " ");
      }

     }
}
