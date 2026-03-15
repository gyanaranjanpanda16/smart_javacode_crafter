package com.gyanaranjan.SerialzationInJava;

import java.io.*;

// Class to be serialized
class Person implements Serializable {
//    private static final long serialVersionUID = 1L; // SerialVersionUID for versioning
    private String name;
    private  int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

 class SerializationExample {
    public static void main(String[] args) {
        // Create an object to serialize
        Person person = new Person("John", 30);

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            // Write the object to the file
            out.writeObject(person);
            System.out.println("Serialization completed. Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            // Read the object from the file
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialization completed. Deserialized person: " + deserializedPerson.getName() + ", " + deserializedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
