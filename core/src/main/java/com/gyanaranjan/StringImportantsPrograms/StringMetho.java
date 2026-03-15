package com.gyanaranjan.StringImportantsPrograms;

public class StringMetho {
    public static void main(String[] args) {
        // String manipulation
        String str = "Hello, Java!";
        System.out.println("Original string: " + str);

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Convert string to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        // Convert string to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        // Check if string contains a substring
        boolean containsSubstring = str.contains("Java");
        System.out.println("Contains 'Java' substring: " + containsSubstring);

        // Replace characters in the string
        String replacedStr = str.replace('o', '0');
        System.out.println("String with replaced characters: " + replacedStr);

        // String concatenation
        String concatenatedStr = str.concat(" Goodbye!");
        System.out.println("Concatenated string: " + concatenatedStr);

        // StringBuilder example
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java");
        stringBuilder.append(" is");
        stringBuilder.append(" awesome!");
        String result = stringBuilder.toString();
        System.out.println("StringBuilder result: " + result);
    }
}
