package com.gyanaranjan.ZenCodingRoundQuestions01;


public class MaxStaircaseHeight {
    public static int height(int blocks) {
        int height = 0;
        int usedBlocks = 0;

        while (usedBlocks + height + 1 <= blocks) {
            height++;
            usedBlocks += height;
        }

        return height;
    }

    public static void main(String[] args) {
        System.out.println(height(10)); // 4
        System.out.println(height(12)); // 4
        System.out.println(height(16)); // 5
    }
}
