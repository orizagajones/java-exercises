import java.util.Scanner;

public class Area {
    //write a program that will calculate the area of a circle based on user input
    public static void main(String[] args) {
        Double radius;
        Double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        radius = in.nextDouble();
        area = (radius * radius) * 3.14;

        System.out.println("The area of the circle with radius " + radius + "is " + area);
    }
}