package com.gyanaranjan.MasterInJava8Program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Person(String name, int age) {

}
public class ComparatorProgram02 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("John",30));
        people.add(new Person("Alica",20));
        people.add(new Person("Bob",35));
        people.add(new Person("Rintu",20));

        // sorting by age using a comparator
        people.sort(Comparator.comparing(Person::age).thenComparing(Person::name));

        // printing a list :-->
       people.forEach(p->System.out.println(p.name()+ " : "+p.age()));

    }
}
