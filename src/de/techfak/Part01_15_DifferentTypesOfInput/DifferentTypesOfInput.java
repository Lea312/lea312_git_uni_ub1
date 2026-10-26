package de.techfak.Part01_15_DifferentTypesOfInput;

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String abc = scan.nextLine();
        System.out.println("Give an integer:");
        int i = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double d = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean b = Boolean.valueOf(scan.nextLine());
        System.out.println( "You gave the string " + abc + "\n" +
                            "You gave the integer " + i + "\n" +
                            "You gave the double " + d + "\n" +
                            "You gave the boolean " + b );

    }
}
