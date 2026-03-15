package com.gyanaranjan.TestingJavaPrgram;

class Test078 {
    // Class definition
}

public class Test03 {
    String a = "hello"; // Declaring a string variable 'a' initialized with "hello"
    Test078 b; // Declaring a reference variable 'b' of type Test078

    // Constructor for Test03 class
    public Test03() {
        b = new Test078(); // Creating an instance of Test078 and assigning it to variable 'b'
    }

    public static void main(String[] args) {
        Test03 test = new Test03(); // Creating an instance of Test03
        System.out.println("Value of a: " + test.a); // Printing the value of 'a'
        System.out.println("Instance of b: " + test.b); // Printing the reference of 'b'
    }
}
