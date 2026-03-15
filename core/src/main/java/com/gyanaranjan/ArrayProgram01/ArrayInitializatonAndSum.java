package com.gyanaranjan.ArrayProgram01;

public class ArrayInitializatonAndSum {
    public static void main(String[] args) {
        Long [] arr = new Long[10];
        for(Long i = 0L; i< arr.length; i++) {
            arr[Math.toIntExact(i)] = i;
        }
        int sum =0;
        for(Long a :arr) sum+=a;
        System.out.println("------------------------");
        System.out.println(sum);
    }
}
