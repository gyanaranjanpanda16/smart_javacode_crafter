package com.gyanaranjan.dsa.daily.day20261020;

import java.util.Objects;

/** Day 1: linear search — O(n) time and O(1) extra space. */
public class LinearSearch {
    public static int findIndex(int[] numbers, int target) {
        Objects.requireNonNull(numbers, "numbers");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Index of 30: " + findIndex(numbers, 30));
        System.out.println("Index of 99: " + findIndex(numbers, 99));
    }
}
