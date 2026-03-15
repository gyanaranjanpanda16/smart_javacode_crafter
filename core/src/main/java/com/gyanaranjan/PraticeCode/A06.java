package com.gyanaranjan.PraticeCode;

public class A06 {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int x = 25 ;
        A06 a06 = new A06();
        System.out.println(isPrime(x));


    }
}
