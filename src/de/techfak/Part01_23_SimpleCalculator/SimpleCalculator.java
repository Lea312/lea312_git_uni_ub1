package de.techfak.Part01_23_SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        float a = Float.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        float b = Float.valueOf(scanner.nextLine());

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        float div = a/b;
        System.out.println(a + " / " + b + " = " + (div));

    }
}
