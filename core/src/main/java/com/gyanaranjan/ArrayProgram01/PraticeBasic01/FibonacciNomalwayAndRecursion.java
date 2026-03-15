package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

import java.util.Scanner;

public class FibonacciNomalwayAndRecursion {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println("Print the Fibonacci up to  "+num+"  Number ");
        int firstTerm=0;
        int secondTerm=1;
        for(int i=1;i<=num;i++){
            System.out.print(firstTerm+" ");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
