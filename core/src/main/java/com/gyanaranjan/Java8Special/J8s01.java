package com.gyanaranjan.Java8Special;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J8s01 {

    public static void main(String[] args) {
        int [] arr = new int[]{1,13,6,7,9,23,5,66};
//        Arrays.stream(arr).filter(n->!(n%2==0)).forEach(System.out::println);
//        List<String> names = Arrays.asList("john","Alice","bob","David");
//        names.stream().filter(s->s.startsWith("A")).map(n->n+"hii").forEach(System.out::println);
        Stream<String> generatedStream = Stream.generate(() -> "element").limit(5);
        System.out.println(generatedStream.collect(Collectors.toList()));
        Stream<Integer> iteratedStream = Stream.iterate(0, n -> n + 2).limit(5);
        System.out.println(iteratedStream.collect(Collectors.toList()));
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            // Process lines
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
