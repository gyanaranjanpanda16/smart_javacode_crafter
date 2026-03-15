package com.gyanaranjan.Java8ConceptProgram;
import java.util.*;

//import java.util.List;
class Employee {
    private String name;
    private double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

public class ComparatorProgram{
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Alice", 50000, 30));
        employees.add(new Employee("Bob", 60000, 25));
        employees.add(new Employee("Charlie", 50000, 35));

//        employees.sort();
//        ArrayList a = new ArrayList();
//        a.sort(a);
//        Collections.sort(a);


        // Using Comparator.comparing() and thenComparin() methods
        employees.sort(Comparator.comparing(Employee::getSalary)
                .reversed()
                .thenComparing(Employee::getAge));
        System.out.println("Sorted by salary (descending) then age (ascending):");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println();

        // Using Comparator.naturalOrder()
        employees.sort(Comparator.comparing(Employee::getName, Comparator.naturalOrder()));
        System.out.println("Sorted by name (natural order):");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println();

        // Using Comparator.nullsFirst()
        employees.add(null);
        employees.sort(Comparator.nullsFirst(Comparator.comparing(Employee::getSalary)));
        System.out.println("Sorted by salary with nulls first:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println();

        // Using Comparator.comparingInt()
        employees.sort(Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by age (ascending):");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
