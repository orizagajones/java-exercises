package org.launchcode.java.studios;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {

    public static float calcArea(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
        // return (float) (3.14 * radius * radius);
    }
    //write a program that will calculate the area of a circle based on user input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //System.in means it will be input from your console

        System.out.println("Please enter the radius of the circle: ");
        float userRadius = input.nextFloat();
        while(userRadius <= 0) {
            System.out.println("Please enter a valid radius.");
            userRadius = input.nextFloat();
        }

        float userArea = calcArea(userRadius);
        System.out.printf("Your area is %f for radius of %f. Have a nice day.", userArea, userRadius);

    }
}

/* Here is how I initially wrote it:
        Double radius;
        Double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        radius = in.nextDouble();
        area = (radius * radius) * 3.14;

        System.out.println("The area of the circle with radius " + radius + "is " + area); */

/* you can also use a do/while:
do {
    userRadius = input.nextFloat();
    if (userRadius <= 0)
        System.out.println("Invalid radius... please try again."
    }while(userRadius <= 0);

 */