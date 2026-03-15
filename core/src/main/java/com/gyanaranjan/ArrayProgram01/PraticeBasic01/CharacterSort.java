package com.gyanaranjan.ArrayProgram01.PraticeBasic01;


public class CharacterSort {
    public static String sortString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Bubble sort
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    // Swap characters
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        // Convert the sorted character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputString = "hello";
        String sortedString = sortString(inputString);

        System.out.println("Original string: " + inputString);
        System.out.println("Sorted string: " + sortedString);
    }
}
