package de.techfak.Part01_16_SecondsInADay;

import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int i = Integer.valueOf(scanner.nextLine());
        int number = i*86400;
        System.out.println(number);
    }
}
