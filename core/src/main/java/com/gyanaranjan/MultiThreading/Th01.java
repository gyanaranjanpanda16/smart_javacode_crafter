package com.gyanaranjan.MultiThreading;

 class Th01 implements Runnable {
     @Override
     public void run() {
         for(int i =0;i<5;i++){
             // code to be executed in the thread
             System.out.println("Thread: "+Thread.currentThread().getId()+"-count : "+i);
             try {
                 Thread.sleep(1000); // sleep for 1 second
             }catch(InterruptedException e){
                 e.printStackTrace();
             }
         }
     }

     public static void main(String[] args) {
         Th01 th01 = new Th01();
         Th01 th02 = new Th01();
         Thread thread = new Thread(th01);
         Thread thread1 = new Thread(th02);
         thread.start();
         thread1.start();

     }
 }
