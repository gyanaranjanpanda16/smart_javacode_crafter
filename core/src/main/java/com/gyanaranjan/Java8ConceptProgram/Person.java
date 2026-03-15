package com.gyanaranjan.Java8ConceptProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

class FilterPersonExample {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 35),
                new Person("Bob", 30),
                new Person("Charlie", 22),
                new Person("David", 35)
        );
        List<Person> l=people.stream().filter(n->n.getAge()>=30).filter(n->n.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println(l);


     }
}
