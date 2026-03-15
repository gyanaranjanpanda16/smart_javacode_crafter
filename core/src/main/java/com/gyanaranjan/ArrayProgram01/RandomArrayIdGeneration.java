package com.gyanaranjan.ArrayProgram01;

import java.util.Random;

public class RandomArrayIdGeneration {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(11);
        int i1 = random.nextInt(6, 11);
        System.out.println("Random generate number between 0 to 10   "+ "[ "+i1+" ]");


    }
}
