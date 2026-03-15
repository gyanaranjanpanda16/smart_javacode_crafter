package com.gyanaranjan.SecondRoundInterviewGuide;

public class DsaFirstNonrepeatingCharacter {
    public static void main(String[] args) {
        String str = "helolehow";
        char[] c = str.toCharArray();
        for(char ch :c){
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.println(ch);
                break;

            }
        }
    }
}
