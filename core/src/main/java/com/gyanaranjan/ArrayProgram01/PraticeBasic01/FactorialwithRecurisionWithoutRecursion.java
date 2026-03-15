package com.gyanaranjan.ArrayProgram01.PraticeBasic01;

import java.util.Scanner;

public class FactorialwithRecurisionWithoutRecursion {
    public int factorialByIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int factorialByRecursion(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialByRecursion(n - 1);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for factorial Count :- ");
        int num = scan.nextInt();
        FactorialwithRecurisionWithoutRecursion factorialRecursionIterative = new FactorialwithRecurisionWithoutRecursion();
        int iterative = factorialRecursionIterative.factorialByIterative(num);
        System.out.println(iterative);
        int recursion = factorialRecursionIterative.factorialByRecursion(num);
        System.out.println(recursion);


    }
}
