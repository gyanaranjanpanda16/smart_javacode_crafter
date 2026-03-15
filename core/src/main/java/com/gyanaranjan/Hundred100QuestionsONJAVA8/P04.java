package com.gyanaranjan.Hundred100QuestionsONJAVA8;

//Explain the concept of default methods in interfaces
// introduced in Java 8. Provide an example illustrating their usage.
// DEFAULT-METHOD :- Default methods in interfaces allow us to add new methods to an interface without
// breaking the classes that already implement it. This feature was introduced
// in Java 8 to support the addition of new methods to interfaces while maintaining backward compatibility.
//. Discuss the use of static and private methods in interfaces introduced in Java 8. Provide examples illustrating
// their usage.
//        Answer:
//        In Java 8, interfaces can now contain static and private methods in addition to abstract
//        and default methods. This allows for better code organization and reuse within interfaces.
//        Here's how they work:
//        Static Methods in Interfaces:
//        Static methods in interfaces are similar to static methods in classes. They can be called
//        directly on the interface without the need for an implementing class instance
//        No - Method-Overriding concept applicable for static and private method in Interface :-
//Private Methods in Interfaces:
//        Private methods in interfaces are used to implement helper methods
//        that are not part of the interface's contract.
//        They can be used to break down complex logic into smaller, more manageable parts
interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle Stopped"); // default method
        addFeature();
    }
    static void run(){
        System.out.println("Vehicle is RUnnning ");
    }
    private  void addFeature(){
        System.out.println("Vehicle should run 100 kmph");
    }
}
class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started");
        Vehicle.run();
    }

}
class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Bike started");
    }
    public void stop() {
        System.out.println("Bike Stopped");
    }

}
public class P04  {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop(); // Output: Vehicle stopped

        Bike bike = new Bike();
        bike.start();
        bike.stop(); // Output: Bike stopped
    }

}
