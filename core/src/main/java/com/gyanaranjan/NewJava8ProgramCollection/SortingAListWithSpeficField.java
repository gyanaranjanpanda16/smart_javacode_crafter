package com.gyanaranjan.NewJava8ProgramCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SortingAListWithSpeficField {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Rintu",25),
                new Person("Roumya",30),
                new Person("Satya",32)
        );
        // sort by age
        people.sort(Comparator.comparing(Person::getAge));
//        people.forEach(p->System.out.println(p.getName()+" : "+p.getAge()));

        //sort by name
        people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge).reversed());
        people.forEach(p->System.out.println(p.getName()+" : "+p.getAge()));
    }
}
