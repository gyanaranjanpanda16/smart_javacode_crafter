package com.gyanaranjan.Hundred100QuestionsONJAVA8;

@FunctionalInterface
interface  A{
    void add(int a,int b);
}

public class P01  {

    public static void main(String[] args) {
        A addLamda = (a, b) -> System.out.println(a + b);
        addLamda.add(10, 20);
    }
}
