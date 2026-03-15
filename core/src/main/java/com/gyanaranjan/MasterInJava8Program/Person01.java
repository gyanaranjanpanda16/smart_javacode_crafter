package com.gyanaranjan.MasterInJava8Program;

public class Person01 {
    private String name;
    private int age;
    private Address address;
    private ContactInfo contactInfo;

    public Person01(String name, int age, Address address, ContactInfo contactInfo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactInfo = contactInfo;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
