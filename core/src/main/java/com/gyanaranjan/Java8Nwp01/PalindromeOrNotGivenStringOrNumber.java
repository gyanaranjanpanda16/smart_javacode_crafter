package com.gyanaranjan.Java8Nwp01;

import java.util.List;
import java.util.stream.Stream;

public class PalindromeOrNotGivenStringOrNumber {
    public static  void checkPalindrome(String s) {
        System.out.println("Input value : "+s);
        //Universal logic :-- for reverse String
        String str = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(str)) {
            System.out.println("Output Value : "+str);
            System.out.println("Given Input is a Palindrome :- ");
        } else {
            System.out.println("Output Value : "+str);
            System.out.println("Given Input is Not a Palindrome :- ");
        }
    }
    public static void main(String[] args) {
        int num =121 ;
        String s1 = "hello";
        String s = String.valueOf(num);
        checkPalindrome(s1);
        System.out.println("=======================");
        checkPalindrome(s);
    }
}
