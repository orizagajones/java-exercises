package exercises;

import java.util.Scanner;

public class CalculateMPG {
    //write a program that calculates mpg with user input for miles driven and gallons consumed
    //use floats for numbers - could be ints or dbls
    public static void main(String[] args) {
        Float milesDriven;
        Float gallonsUsed;
        Float MPG;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the number of miles you've driven:");
        milesDriven = in.nextFloat();
        System.out.println("Enter the number of gallons your car has used:");
        gallonsUsed = in.nextFloat();
        MPG = milesDriven/gallonsUsed;

        System.out.println("Your car gets " + MPG + " miles per gallon.");

    }
}
