package exercises;

import java.util.Scanner;

public class Prompt {
    public static void main (String[] args) {
        //alter your "Hello, World!" program to greet the user by name
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = in.next();

        System.out.println("Hello," + name + "!");
    }
}
