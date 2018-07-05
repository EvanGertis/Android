package com.example.javapractice;

public class SelfDrivingCar extends Car {


    public SelfDrivingCar(String name, String colour, String interior) {
        super(name, colour);
        System.out.println("Construction self-driving car. Installing Skynet 4.2.0");
        super.interior = interior;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving to Googleplex, Mountain View");
    }
}
