package com.gyanaranjan.Hundred100QuestionsONJAVA8;


// Discuss the concept of the java.util.Optional class introduced in Java 8.
//       1)  Explain its purpose and provide examples of how it can be used.
//        Answer:
//          The java.util.Optional class introduced in Java 8 is used to represent an optional
//        value, meaning a value that may or may not be present. It provides methods to work
//        with values that might be null, helping to prevent NullPointerExceptions and making
//        the code more robust.
//        Purpose of Optional:
//        To explicitly express the possibility of a value being absent.
//        To encourage better coding practices by forcing developers to handle both the presence
//        and absence of values explicitly.
//       it gives NoSuchElement Exception rather than  Null-Pointer-Exception   :--->
//        empty():   Returns an empty Optional instance.
//        filter(Predicate<? super T> predicate):  If a value is present, and the value matches the given predicate, returns an Optional describing the value, otherwise returns an empty Optional.
//        flatMap(Function<? super T, W? extends Optional<U>> mapper):  If a value is present, applies the given Optional-bearing mapping function to it, returns that result, otherwise returns an empty Optional.
//        get():  If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
//        ifPresent(Consumer<? super T> consumer):  If a value is present, invokes the specified consumer with the value, otherwise does nothing.
//        ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction):  If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
//        isEmpty():  Returns true if there is no value present, otherwise false.
//        isPresent():  Returns true if a value is present, otherwise false.
//        map(Function<? super T, ? extends U> mapper):  If a value is present, applies the provided mapping function to it, and if the result is non-null, returns an Optional describing the result, otherwise returns an empty Optional.
//        of(T value):  Returns an Optional with the specified present non-null value.
//        ofNullable(T value):  Returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
//        orElse(T other):  Returns the value if present, otherwise returns other.
//        orElseGet(Supplier<? extends T> supplier):  Returns the value if present, otherwise returns the result produced by the supplying function.
//        orElseThrow(): <X extends Throwable> X:  Returns the value if present, otherwise throws NoSuchElementException.
//        orElseThrow(Supplier<? extends X> exceptionSupplier): <X extends Throwable> X:  Returns the value if present, otherwise throws an exception produced by the supplying function.


import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create an Optional with a non-null value
        Optional<String> optionalWithValue = Optional.of("hello");

        // Create an Optional with a null value
        Optional<String> optionalWithNull = Optional.ofNullable(null);

        // isPresent() example
        if (optionalWithValue.isPresent()) {
            System.out.println("Value is present: " + optionalWithValue.get());
        } else {
            System.out.println("Value is absent");
        }

        // ifPresent() example
        optionalWithValue.ifPresent(value -> System.out.println("Value: " + value));

        // isEmpty() example
        System.out.println("Is optionalWithValue empty? " + optionalWithValue.isEmpty());
        System.out.println("Is optionalWithNull empty? " + optionalWithNull.isEmpty());

        // map() example
        Optional<Integer> lengthOptional = optionalWithValue.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length of value: " + length));

        // orElse() example
        String result = optionalWithNull.orElse("Default Value");
        System.out.println("Result: " + result);

        // orElseGet() example
        String result2 = optionalWithNull.orElseGet(() -> "Default Value from supplier");
        System.out.println("Result 2: " + result2);

        // orElseThrow() example
        try {
            String result3 = optionalWithNull.orElseThrow(() -> new RuntimeException("Value is absent"));
            System.out.println("Result 3: " + result3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
