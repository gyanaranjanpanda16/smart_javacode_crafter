package com.gyanaranjan.Top120ProblemSolvingInJava;

import java.util.Scanner;

public class EnhancedSwitchBlockJava14 {
    private  int apiCall() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get Status Code from Server :--");
        return scanner.nextInt();

    }
    public static void statusCodeMeaning(){
        int statusCode = new EnhancedSwitchBlockJava14().apiCall(); // Some method that returns an HTTP status code
        String result = switch (statusCode) {
            case 200, 201 -> "Success";
            case 400 -> "Bad Request";
            case 401 -> "Unauthorized";
            case 403 -> "Forbidden";
            case 404 -> "Not Found";
            case 500, 501 -> "Server Error";
            default -> "Unexpected status code";
        };
        System.out.println(result);
        statusCodeMeaning();
    }

    public static void main(String[] args) {
       statusCodeMeaning();

    }


}