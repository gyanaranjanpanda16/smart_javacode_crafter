package com.gyanaranjan.NWPro01;

import com.gyanaranjan.MasterInJava8Program.Address;

import java.util.List;

class Employee1 {
    private  String name;
    private List<Address> age;
    private double salary;

     public Employee1(String name, List<Address> age, double salary) {
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public List<Address> getAge() {
         return age;
     }

     public double getSalary() {
         return salary;
     }

     @Override
     public String toString() {
         return "Employee1{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", salary=" + salary +
                 '}';
     }

   }
