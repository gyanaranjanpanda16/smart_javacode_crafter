package com.gyanaranjan.StsIdeProgram.gyanaranjan;


abstract class Vehicle {
	    private String model;
	    private int year;

	    public Vehicle(String model, int year) {
	        this.model = model;
	        this.year = year;
	    }

	    public abstract void start();

	    public abstract void stop();

	    public void displayInfo() {
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }
	}

class Car extends Vehicle {
	    public Car(String model, int year) {
	        super(model, year);
	    }

	    @Override
	    public void start() {
	        System.out.println("Car is starting.");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Car is stopping.");
	    }
	}

	class Motorcycle extends Vehicle {
	    public Motorcycle(String model, int year) {
	        super(model, year);
	    }

	    @Override
	    public void start() {
	        System.out.println("Motorcycle is starting.");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Motorcycle is stopping.");
	    }
	}
	public class Test04 {
	    public static void main(String[] args) {
	        Car car = new Car("Sedan", 2023);
	        Motorcycle motorcycle = new Motorcycle("Sport Bike", 2023);

	        car.displayInfo();
	        car.start();
	        car.stop();

	        System.out.println();

	        motorcycle.displayInfo();
	        motorcycle.start();
	        motorcycle.stop();
	    }
	}


