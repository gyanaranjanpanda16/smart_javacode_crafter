package com.gyanaranjan.CheckJavaConcept;
class Parent {
    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void print(int a) {
        System.out.println("Child");
    }
}

public class main {
    public static void main(String[] args) {
        Parent obj1 = new Child();
        ((Child) obj1).print(10);

        Child obj2 = new Child();
        obj2.print();
    }
}
