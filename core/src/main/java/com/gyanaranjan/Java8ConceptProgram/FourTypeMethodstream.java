package com.gyanaranjan.Java8ConceptProgram;


import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FourTypeMethodstream {
    int add(int a, int b ){
        return  a+b;
    }
    void add1(int a){

    }
    String name(){
        return "gyana";
    }
    void add3(){
        System.out.println("hii");
    }
    public static void main(String[] args) {
        FourTypeMethodstream fourTypeMethodstream = new FourTypeMethodstream();
        int add = fourTypeMethodstream.add(10, 20);
        System.out.println(add);
        fourTypeMethodstream.add1(10);
        fourTypeMethodstream.add3();
        String name = fourTypeMethodstream.name();
        System.out.println(name);
        //Example :- 01
        Predicate < Integer > predicate = (t) -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(predicate.test(11));
        // Example :- 02
        Function< String, Integer > function = (t) -> t.length();
        System.out.println(function.apply("Gyanaranjan"));
        // Example :- 03
        Consumer< String > consumer = (t) -> System.out.println(t);
        consumer.accept("Gynaranjan");
        // Example :- 04
        Supplier supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
    }
}