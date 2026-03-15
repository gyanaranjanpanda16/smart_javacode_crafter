package com.gyanaranjan.MultiThreading;

public class EvenOddPrinter  {
    private static int count = 1;
    private static final int MAX_COUNT = 20;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter(), "OddThread");
        Thread evenThread = new Thread(new EvenPrinter(), "EvenThread");

        oddThread.start();
        evenThread.start();
    }

    static class OddPrinter implements Runnable {
        public void run() {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + ": " + count);
                        count++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class EvenPrinter implements Runnable {
        public void run() {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count);
                        count++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
