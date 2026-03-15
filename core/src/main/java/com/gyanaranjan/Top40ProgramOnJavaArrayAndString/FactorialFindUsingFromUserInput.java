package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;


import java.util.InputMismatchException;
import java.util.Scanner;

// find factorial of given number and if give invalid give again process take input
public class FactorialFindUsingFromUserInput {
    public  static  int findFactorial(int n){
        if(n==0||n==1){
            return  1;
        }else {
            return  n*findFactorial(n-1);
        }
    }
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find factorial :-");
        try {
            int i = scanner.nextInt();
            int factorial = findFactorial(i);
            System.out.println("Result of Factorial Given input is :-  "+factorial);
            userInput();
        } catch (InputMismatchException e) {
            System.out.println("Enter the Valid input Like Integer");
            userInput();
        }

    }
    public static void main(String[] args) {
        userInput();


    }
}
