package com.gyanaranjan.JavaCoding30DaysChallenge;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static List<Employee> getEmployee(){
        return Arrays.asList(new Employee("Carrie", "C"),
                new Employee("Fanishwar", "F"),
                new Employee("Arian", "B"),
                new Employee("Donald", "D"),
                new Employee("Adam", "A"),
                new Employee("Evan", "E")
        );
    }
    private static Map<String, Employee> mapEmployees(List<Employee> employees) {
       return employees.stream().collect(Collectors.toMap(Employee::getName, employee -> employee));
       // Function identity--> employee -> employee
    }


    public static void main(String[] args) {
     List<Employee> employees = getEmployee();
//        System.out.println("<==========: Before sorting Value :===============>");
//        System.out.println(employees);
//        System.out.println("<==========: After sorting Value :===============>");
//        employees.sort(new Comparator<Employee>() {
//            // Anonymous class :--->
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o2.getGrade().compareTo(o1.getGrade());
//            }
//        });
//        employees.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
//      employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getGrade));
//        System.out.println(employees);
        Map<String, Employee> employeeMap = mapEmployees(employees);

        // To print the map, for example
        employeeMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }


}
