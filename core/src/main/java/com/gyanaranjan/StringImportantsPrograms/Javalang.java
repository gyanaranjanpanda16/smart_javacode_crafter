package com.gyanaranjan.StringImportantsPrograms;


// " java.lang package provides classes that are fundamental to the design of the Java programming language":-
// All Wrapper class :=
public class Javalang {
    public static void main(String[] args) {
        // java lang package have 11 method :--
      //Here are total 11 method present in object class :--
        // why object class is super class of each class -- due to archive code reuse ability
//        and archive run time polymorphism ..

//        .toString(); :-- we use this method to string representation of an object.
//        .clone();  :--
//        .equals();
//        .hashCode();
//        .getClass();
//       .notify();
//        .notifyAll();
//        .wait();
//        .wait();
//        .wait(2,6);
//        .finalize();

                Object obj1 = new Object();
                Object obj2 = new Object();

                // toString() method
                System.out.println("String representation of obj1: " + obj1.toString());

                // hashCode() method
                System.out.println("Hash code of obj1: " + obj1.hashCode());

                // equals() method
                System.out.println("obj1 equals obj2: " + obj1.equals(obj2));

                // getClass() method
                System.out.println("Class of obj1: " + obj1.getClass().getName());

                // wait(), notify(), notifyAll() methods
                synchronized (obj1) {
                    try {
                        obj2.wait();
                        obj1.notify();
                        obj1.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // clone() method
//                try {
//                    Object clonedObj= obj1.clone();
//                    System.out.println("Cloned object: " + clonedObj);
//                } catch (CloneNotSupportedException e) {
//                    e.printStackTrace();
//                }

                // finalize() method
                obj1 = null;
                System.gc();
            }
        }




