package com.gyanaranjan.Hundred100QuestionsONJAVA8;


//Explain the concept of method references in Java 8. Provide examples illustrating different types of method
//        references.
//
//        Answer:
//        Method references in Java 8 provide a way to refer to methods or constructors
//        without invoking them directly.They are often used to make code more concise and
//        readable, especially in functional interfaces. There are four types of method references:

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
// static reference :-->
 class Main {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = Main::isEven;
        System.out.println(predicate.test(4)); // Output: true
    }


}

// instance Method  reference :--
 class Main1 {
    public void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Main1 main = new Main1();
        Consumer<String> consumer = main::print;
        consumer.accept("Hello, world!"); // Output: Hello, world!
    }
}


 class Main2 {
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Function<String, String> function = Main2::toUpperCase; // check
        System.out.println(function.apply("hello")); // Output: HELLO
    }
}


class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

 class Main3 {
    public static void main(String[] args) {
        Function<String, Person> function = Person::new;
        Person person = function.apply("John");
        System.out.println(person.getName()); // Output: John
    }
}

public class P05 {
}