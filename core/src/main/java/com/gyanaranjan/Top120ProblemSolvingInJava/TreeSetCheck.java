package com.gyanaranjan.Top120ProblemSolvingInJava;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCheck {
    public static void main(String[] args) {
        Set set = new TreeSet(Comparator.comparing(Employee::getName));
        Employee employee = new Employee(1, "somya", 99.00);

        Employee employee1 = new Employee(2, "gyana", 99.00);

        Employee employee2 = new Employee(3, "panda", 99.30);
        set.add(employee);
        set.add(employee1);
        set.add(employee2);
        System.out.println(set);


    }
}
