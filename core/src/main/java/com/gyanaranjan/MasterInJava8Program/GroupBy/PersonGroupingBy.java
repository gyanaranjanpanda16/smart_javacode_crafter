package com.gyanaranjan.MasterInJava8Program.GroupBy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonGroupingBy {
    public static void main(String[] args) {
        List<Person> listGroups = new ArrayList<>();
            listGroups.add(new Person("gyan",25));
            listGroups.add(new Person("laxmi",25));
            listGroups.add(new Person("soumya",30));
        Map<Integer, List<Person>> collect = listGroups.stream().collect(Collectors.groupingBy(Person::getAge));
//        Iterator01<Map.Entry<Integer, List<Person>>> iterator = collect.entrySet().iterator();
//        while ((iterator.hasNext())){
//            Map.Entry<Integer, List<Person>> next = iterator.next();
//            System.out.println(next.getKey() + ":"+next.getValue());
//
//        }
        collect.forEach((age,group) ->{
            System.out.println("people with age "+age+":");
            group.forEach((person) -> System.out.println("-"+person.getName()));
            System.out.println();
        });
    }
}
