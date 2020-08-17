package excercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;
        Scanner inputOne = new Scanner(System.in);
        System.out.println("Please enter miles travelled:");
        miles = inputOne.nextDouble();

        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter the amount of gas you've consumed:");
        gallons = inputTwo.nextDouble();

        milesPerGallon = miles/gallons;
        System.out.println("Your miles per gallon is " + milesPerGallon);


    }
}
