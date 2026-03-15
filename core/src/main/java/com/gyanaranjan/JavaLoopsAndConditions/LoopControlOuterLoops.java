package com.gyanaranjan.JavaLoopsAndConditions;

public class LoopControlOuterLoops {
    public static void main(String[] args) {
        outerLoop:
        for(int i =1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i*j>4){
                    break outerLoop;
                }
                System.out.println("  i "+i+"  j "+j);
            }
        }
    }
}
