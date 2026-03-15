package com.gyanaranjan.Java8Nwp01;

/**
 * check palindrome that 121 --> 121 (true)
 */
public class PalindromeNumber {
    public static boolean checkPalindrome(int n){
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        String s2 = new String(reverse);
       if(s.equals(s2)){
        return  true;
       }
       else{
           return false;
       }


    }
    public static void main(String[] args) {
        int n = 121;
        System.out.println(checkPalindrome(n));

    }
}
