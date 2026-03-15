package com.gyanaranjan.InterviewQ;

public class Example03 {
        public static void main(String[] args) {
            foo(null);
        }

        public static void foo(Object obj){
            System.out.println("StringBuffer impl");
        }

        public static void foo(String s) {
            System.out.println("String argument");
        }
    }

