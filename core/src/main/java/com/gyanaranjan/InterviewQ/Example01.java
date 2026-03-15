package com.gyanaranjan.InterviewQ;

//Check whether a given string is palindrome or not,
public class Example01 {
    public static void main(String[] args) {
        String str = "aba";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
           rev+=str.charAt(i);
        }
       if(rev.equals(str)){
       System.out.println("Given String is Palindrome ");
        }else{
            System.out.println("Given String not a Palindrome");
        }

    }
}
