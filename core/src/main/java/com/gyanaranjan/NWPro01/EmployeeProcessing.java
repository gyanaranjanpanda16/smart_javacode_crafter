package com.gyanaranjan.NWPro01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }
}

class Employee {
    private String name;
    private List<Address> addresses;
    private double salary;

    public Employee(String name, List<Address> addresses, double salary) {
        this.name = name;
        this.addresses = addresses;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}

public class EmployeeProcessing {
    public static void main(String[] args) {
        List<Address> johnAddresses = new ArrayList<>();
        johnAddresses.add(new Address("New York", "123 Main St"));
        johnAddresses.add(new Address("New York", "456 Elm St"));

        List<Address> aliceAddresses = new ArrayList<>();
        aliceAddresses.add(new Address("San Francisco", "789 Oak St"));
        aliceAddresses.add(new Address("San Francisco", "101 Maple St"));

        List<Address> bobAddresses = new ArrayList<>();
        bobAddresses.add(new Address("New York", "111 Pine St"));
        bobAddresses.add(new Address("Los Angeles", "222 Cedar St"));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", johnAddresses, 50000));
        employees.add(new Employee("Alice", aliceAddresses, 60000));
        employees.add(new Employee("Bob", bobAddresses, 70000));

        // Calculate average salary of employees in each city
        Map<String, Double> averageSalaryByCity = employees.stream()
                .flatMap(emp -> emp.getAddresses().stream()
                        .map(Address::getCity)
                        .distinct()
                        .map(city -> new HashMap.SimpleEntry<>(city, emp.getSalary())))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.averagingDouble(Map.Entry::getValue)
                ));

        System.out.println("Average Salary by City:");
        averageSalaryByCity.forEach((city, averageSalary) ->
                System.out.println(city + ": " + averageSalary));
    }
}
