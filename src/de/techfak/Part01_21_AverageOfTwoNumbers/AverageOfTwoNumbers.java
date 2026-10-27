package de.techfak.Part01_21_AverageOfTwoNumbers;

import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double a = Double.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double b = Double.valueOf(scanner.nextLine());

        System.out.println("The average is " + ((a+b)/2));
    }
}
