package com.gyanaranjan.Hundred100QuestionsONJAVA8;


import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class P07 {
    public static void main(String[] args) {
        // Predicate: Checks if a string has more than 5 characters
        Predicate<String> isLongString = str -> str.length() > 5;

        // Function: Converts a string to uppercase
        Function<String, String> toUpperCaseFunction = str -> str.toUpperCase();

        // Supplier: Supplies a random number between 1 and 100
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100) + 1;

        // Function: Computes the square of a number
        Function<Integer, Integer> squareFunction = num -> num * num;

        // Function: Calculates the length of a string
        Function<String, Integer> stringLengthFunction = String::length;

        // Supplier: Supplies the current timestamp in milliseconds
        Supplier<Long> currentTimeMillisSupplier = System::currentTimeMillis;

        // Test the Predicate
        String testString = "Hello World";
        System.out.println("Is the string \"" + testString + "\" long? " + isLongString.test(testString));

        // Apply the Function to convert a string to uppercase
        String inputString = "hello";
        String resultString = toUpperCaseFunction.apply(inputString);
        System.out.println("Uppercase of \"" + inputString + "\": " + resultString);

        // Apply the Function to compute the square of a number
        int number = 5;
        int square = squareFunction.apply(number);
        System.out.println("Square of " + number + ": " + square);

        // Apply the Function to calculate the length of a string
        String text = "Java is awesome!";
        int length = stringLengthFunction.apply(text);
        System.out.println("Length of \"" + text + "\": " + length);

        // Get a random number from the Supplier
        int randomNumber = randomNumberSupplier.get();
        System.out.println("Random Number: " + randomNumber);

        // Get the current timestamp from the Supplier
        long currentTimeMillis = currentTimeMillisSupplier.get();
        System.out.println("Current Time in milliseconds: " + currentTimeMillis);
    }
}
