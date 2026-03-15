package com.gyanaranjan.ArrayProgram01.PraticeBasic01;
import java.util.Scanner;
public class PrimeNumberCheck {
    public static boolean ifNum(int a) {
        if (a == 0 || a == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return true;
            }
        }
        return false;
    }
    // Calculate sum of first 10 prime numbers
//    public static void sumofPrimeNum(int a){
//    int count = 0;
//    int num = 2; // Start checking from 2
//    int sum = 0;
//        while (count < a) {
//        if (!ifNum(num)) { // If num is not prime
//            num++;
//            continue;
//        }
//        sum += num;
//        num++;
//        count++;
//    }
//        System.out.println("Sum of first 10 prime numbers: " + sum);
//}
    public static void main(String[] args) {
        System.out.println("Enter a number :-");
        int scan = new Scanner(System.in).nextInt();
        if (ifNum(scan)) {
            System.out.println(scan + " is a Prime Number");
        } else {
            System.out.println(scan + " Not a Prime Number");
        }
        System.out.println("Enter prime number sum :-");
        int scan1 = new Scanner(System.in).nextInt();
//        PrimeNumberCheck.sumofPrimeNum(scan1);
    }
}
