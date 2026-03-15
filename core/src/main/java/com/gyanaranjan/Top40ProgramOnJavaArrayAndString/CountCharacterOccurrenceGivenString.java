package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

public class CountCharacterOccurrenceGivenString {
    public static void main(String[] args) {
        String s ="java Programming java Opps";
        int totalCount= s.length();
        String lowerCase = s.toLowerCase();
        int afterRemove=lowerCase.replace("p","").length();
        int charOccurence=totalCount-afterRemove;
        System.out.println("Number occurance of p is :"+ charOccurence);
    }
}

