package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class ReverseStringSentenceWordByWordAndGivenString {
    public static void main(String[] args) {
        String s1 = "Hii my name java"; // word by word , whole sentence reverse.
        String[] str = s1.split("\\s+");
       // Word by Word Reverse String :-->
        for(String rev :str){
            StringBuilder builder = new StringBuilder(rev);
            System.out.print(builder.reverse()+" ");
        }
        System.out.println("----------------------------------");
        // Reverse Whole string sentence :-->
        for(int i = s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
    }
}
