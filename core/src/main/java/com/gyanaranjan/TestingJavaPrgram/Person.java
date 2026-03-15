package com.gyanaranjan.TestingJavaPrgram;


// Define a class representing a Person
class Person {
    // Instance variables (attributes)
     String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

 class Main {
    public static void main(String[] args) {
        // Create instances of Person class
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);

        // Access attributes using getter methods
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.getAge());

        System.out.println();

        // Access attributes and invoke methods directly
        System.out.println("Person 2:");
        person2.displayInfo();

    }
}
