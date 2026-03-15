package com.gyanaranjan.Java8Nwp01;
import java.util.*;
import java.util.stream.Collectors;


class Employee {
    private String name;
    private int age;
    private String department;
    private List<String> addresses;

    public Employee(String name, int age, String department, List<String> addresses) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}

class Salary {
    private String name;
    private double amount;

    public Salary(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 25, "Engineering", Arrays.asList("123 Main St")),
                new Employee("Alice", 35, "HR", Arrays.asList("456 Oak St")),
                new Employee("Bob", 20, "Finance", Arrays.asList("789 Elm St")),
                new Employee("Alice", 30, "Engineering", Arrays.asList("456 Oak St"))
        );

        List<Salary> salaries = Arrays.asList(
                new Salary("John", 5000),
                new Salary("Alice", 6000),
                new Salary("Bob", 7000),
                new Salary("Alice", 5500)
        );

        // Group employees by department
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees by department:");
        System.out.println(employeesByDepartment);

        // Partition employees into two groups based on age (30 or above)
        Map<Boolean, List<Employee>> partitionedByAge = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() >= 30));
        System.out.println("Employees partitioned by age (30 or above):");
        System.out.println(partitionedByAge);

        // Group salaries by employee name
        Map<String, Double> totalSalaryByName = salaries.stream()
                .collect(Collectors.groupingBy(Salary::getName, Collectors.summingDouble(Salary::getAmount)));
        System.out.println("Total salary by employee name:");
        System.out.println(totalSalaryByName);
    }
}
