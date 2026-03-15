package com.gyanaranjan.java8ProgrammingQuestion;

import java.util.*;

class Employee {
    String name;
    int Age;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        Age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", salary=" + salary +
                '}';
    }
}

public class Q02 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>(Arrays.asList(
               new Employee("Ramesh",23,25000.00),
                new Employee("Ramesh",2,25000.00),
                new Employee("Rame8",56,65000.00),
                new Employee("Rames",32,75000.00)
                 ));
        Optional<Employee> r = list.stream().filter(n -> n.getName().startsWith("R")).max(Comparator.comparingInt(Employee::getAge));
         r.ifPresentOrElse(n-> System.out.println("result   "+n),()-> System.out.println("not found"));
    }
}
