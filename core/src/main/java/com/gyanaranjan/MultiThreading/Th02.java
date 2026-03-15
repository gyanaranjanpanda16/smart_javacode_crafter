package com.gyanaranjan.MultiThreading;

 class Th02 extends Thread {
     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             // code to be executed in the thread
             System.out.println("Thread: " + Thread.currentThread().getId() + "-count : " + i);
             try {
                 Thread.sleep(1000); // sleep for 1 second
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }
 }
     class Hello{
         public static void main(String[] args) {
             Th02 th02 = new Th02();
             Th02 th03 = new Th02();
             th02.start();
             th03.start();
         }
    }

