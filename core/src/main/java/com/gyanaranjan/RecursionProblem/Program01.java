package com.gyanaranjan.RecursionProblem;

public class Program01 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;                // recursion
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Program01.factorial(5));
    }
}
