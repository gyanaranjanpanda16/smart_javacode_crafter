package com.gyanaranjan.StreamApi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) throws InterruptedException {
        Optional reduce = Stream.of().reduce((a, b)-> a.equals(b));
//        System.out.println(reduce.isPresent()?reduce.get():"Empty Stream");
        System.out.println(reduce);

    }
}
