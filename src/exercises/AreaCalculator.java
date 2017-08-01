package exercises;

import java.util.Scanner;

public class AreaCalculator {
    //write a program to calculate the area of a rectangle & print the answer to the console
    //make the dimension Integers for the sake of ease; they could also be floats or doubles
    public static void main(String[] args) {
        Integer height;
        Integer width;
        Integer area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the height of the rectangle, in whole units:");
        height = in.nextInt();
        System.out.println("Please enter the width of the rectangle, in whole units:");
        width = in.nextInt();

        area = width * height;
        System.out.println("The area of the rectangle is " + area + ".");


    }
}
