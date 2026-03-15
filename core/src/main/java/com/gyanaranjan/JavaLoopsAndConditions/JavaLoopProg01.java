package com.gyanaranjan.JavaLoopsAndConditions;

public class JavaLoopProg01 {
    public static void main(String[] args) {
        System.out.println("---------------For-Loop--------------------");
        // For-Loop :-
      for(int i = 1; i<=5; i++){
          System.out.println(i);
      }
      System.out.println("-------------While-Loop---------------");
       // While-Loop :-
      int count = 1;
      while(count<=5){
          System.out.println(count);
          count++;
      }
      System.out.println("-------------Do-While Loop--------------");
      // Do-While Loop :-
        int i =1;
      do{
          System.out.println(i);
          i++;
      }while (i<=5);

      System.out.println("------------for-each loop--------------");
     // Enhanced for Loops(for-each loops) :-
        int [] arr = {2,5,6,7,8,9,9};
        for(int x :arr){
            System.out.println("Values : - " +x);
        }
        System.out.println("-----------Nested Loops---------------");
        //Nested Loops :--
        for(int j=0;j<=3;j++){
            for(int k=0;k<=3;k++){
                System.out.println(" j : "+j+" k :"+k);
            }
        }
        System.out.println("--------- Break-Continue -----------------");
        //Break-Continue
        for(int m =1; m<=10;m++){
            if (m == 9) {
                break;   // Exit Loop when i equals 9
            }
            if(m%2==0){
                continue; // skip even number
            }
            System.out.println("Number : "+m);
        }

    }
}
