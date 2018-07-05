package com.example.javapractice;

public class CarSimulator {

    public static void main(String[] args) {
        System.out.println("Working...");

        Car Camry = new Car("Orange");
        Car Rav4 = new Car("Rav4", "Pink");

        Rav4.drive();

        SelfDrivingCar autoBot = new SelfDrivingCar("autoBot", "yellow", "plastic");
        System.out.println("Car name: " + autoBot.getName());
        System.out.println("Car colour: " + autoBot.getColour());
        System.out.println("Car interior: " + autoBot.getInterior());
        autoBot.drive();

    }
}
