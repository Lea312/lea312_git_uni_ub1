package de.techfak.Part01_21_AverageOfTwoNumbers;

import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        double avg = (a+b)/2.0f;
        System.out.println("The average is " + avg);
    }
}
