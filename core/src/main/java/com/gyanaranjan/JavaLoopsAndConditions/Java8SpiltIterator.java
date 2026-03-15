package com.gyanaranjan.JavaLoopsAndConditions;


import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

// SpiltIterator : spilit into Multiple parts ..
public class Java8SpiltIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hii", "jii", "hlo", "nameste");
        Spliterator<String> spliterator = list.spliterator();
        long l = spliterator.estimateSize();
        System.out.println(l);
        while (spliterator.tryAdvance(System.out::println)) {
        }
        System.out.println("-------------------------");
        list.stream().parallel().spliterator().trySplit().forEachRemaining(System.out::println);
    }
}
