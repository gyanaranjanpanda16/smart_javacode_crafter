package com.gyanaranjan.ArrayProgram01.gyanaranjan;


// WAP to search for a specific element in an array
public class Test06 {
    static int target=1;
    static int linearSearch(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
               return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 4, 8};
        int res =linearSearch(numbers);
        if (res!= -1) {
            System.out.println(target + " found at index " + res);
        } else {
            System.out.println(target + " not found in the array");
        }
    }
}
