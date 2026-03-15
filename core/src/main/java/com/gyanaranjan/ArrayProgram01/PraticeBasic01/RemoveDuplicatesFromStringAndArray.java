package com.gyanaranjan.ArrayProgram01.PraticeBasic01;


import java.util.HashSet;
import java.util.Set;
 class RemoveDuplicatesFromStringAndArray {
     public static String removeDuplicates(String str) {
         Set<Character> seen = new HashSet<>();
         StringBuilder result = new StringBuilder();

         for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             if (!seen.contains(ch)) {
                 seen.add(ch);
                 result.append(ch);
             }
         }
         return result.toString();
     }
     public static int[] removeDuplicates(int[] arr) {
         Set<Integer> seen = new HashSet<>();
         int[] result = new int[arr.length];
         int index = 0;

         for (int i = 0; i < arr.length; i++) {
             if (!seen.contains(arr[i])) {
                 seen.add(arr[i]);
                 result[index++] = arr[i];
             }
         }
         // Trim the result array to remove any trailing zeros
         return java.util.Arrays.copyOf(result, index);
     }
    public static void main(String[] args) {
        String input = "hello world";
        String result = removeDuplicates(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
        int[] arr = {1, 2, 3, 4, 1, 2, 5};
        int[] result1 = removeDuplicates(arr);
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        System.out.println("Array after removing duplicates: " + java.util.Arrays.toString(result1));
    }


}
