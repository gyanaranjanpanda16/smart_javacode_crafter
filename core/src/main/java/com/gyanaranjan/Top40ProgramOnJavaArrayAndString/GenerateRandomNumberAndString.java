package com.gyanaranjan.Top40ProgramOnJavaArrayAndString;

import java.util.Random;

public class GenerateRandomNumberAndString {
    public static void main(String[] args) {
        // Appraoch -1
        Random random = new Random();
        int i = random.nextInt(100);
        double v = random.nextDouble();
        System.out.println(i);
        System.out.println(v);
        System.out.println(Math.random());
    }
}
