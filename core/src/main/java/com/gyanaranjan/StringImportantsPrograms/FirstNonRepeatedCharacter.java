package com.gyanaranjan.StringImportantsPrograms;

public class  FirstNonRepeatedCharacter {


    public static void main(String[] args) {
        String str = "welwel";

        char firstNonRepeating = findFirstNonRepeating(str);

        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found");
        }
    }

    private static char findFirstNonRepeating(String str) {
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return '\0'; // If no non-repeating character found
     }
    }

