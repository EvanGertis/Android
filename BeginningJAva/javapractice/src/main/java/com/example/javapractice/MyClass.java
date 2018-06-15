package com.example.javapractice;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==WELCOME TO THE BMI CALCULATOR PROGRAM==");
        System.out.println("=========================================");
        System.out.println("Please enter your height: ");

        double height = scanner.nextDouble();

        System.out.println("Please enter your weight: ");

        double weight = scanner.nextDouble();

        System.out.println("==Calculating==");
        BMI(height, weight);
    }

    public static void BMI(double height, double weight){
        double bmi = weight/height;

        if(bmi > 25)
        {
            System.out.println("You are overweight");
        }
        else if(bmi >18.5 || bmi < 25)
        {
            System.out.println("You are of normal weight");
        }
        else
        {
            System.out.println("You are underweight");
        }
    }
}
