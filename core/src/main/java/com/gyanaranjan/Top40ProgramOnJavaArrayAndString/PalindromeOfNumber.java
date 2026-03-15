package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class PalindromeOfNumber {
    public static int reverseNum(int num){
        int rev =0 ;
        while(num!=0){
            rev = rev*10 +num%10;
            num = num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 121;
        if(reverseNum(num)==num){
            System.out.println("Given Number is a Palindrom :-->");
        }else{
            System.out.println("Given Number is Not a Palindrome :-->");
        }
    }
}
