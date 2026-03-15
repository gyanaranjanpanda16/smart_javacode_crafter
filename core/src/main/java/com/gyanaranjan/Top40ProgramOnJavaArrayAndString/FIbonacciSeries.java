package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class FIbonacciSeries {
    public static void main(String[] args) {
        int term =10;
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i=1;i<=term;i++){
            System.out.print(firstTerm +" ");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }

}
