package com.gyanaranjan.JavaCoding30DaysChallenge;


public class PrimeNumberGenerator {
    public static void main(String[] args) {
        int limit = 100;  // Limit to which you want to find prime numbers
        for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            }
        }
    }
}
