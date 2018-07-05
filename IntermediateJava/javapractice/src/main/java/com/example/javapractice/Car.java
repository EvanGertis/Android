package com.example.javapractice;

public class Car {

    public String colour = "Black";
    private int numberOfSeats = 5;
    public String name;
    public String interior;

    public Car() {

    }

    public Car(String colour){
        this.colour = colour;
    }

    public Car(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public String getInterior() {
        return interior;
    }

    private void brakeWithABS(){

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public void drive(){
        System.out.println("car is driving");
    }
}



