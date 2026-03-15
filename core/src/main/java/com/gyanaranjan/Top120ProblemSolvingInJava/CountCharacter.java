package com.gyanaranjan.Top120ProblemSolvingInJava;

public class CountCharacter {
    public static void main(String[] args) {
        int a = 345678;
        int count=0;
        while(a>0){
            a/= 10;
            count++;
        }
        System.out.println(count);
    }
}
