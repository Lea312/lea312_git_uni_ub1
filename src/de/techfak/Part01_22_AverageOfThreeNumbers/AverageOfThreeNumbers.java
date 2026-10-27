package de.techfak.Part01_22_AverageOfThreeNumbers;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        double a = Double.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        double b = Double.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        double c = Double.valueOf(scanner.nextLine());

        System.out.println("The average is " + ((a+b+c)/3));

    }
}
