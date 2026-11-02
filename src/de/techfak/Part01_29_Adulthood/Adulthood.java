package de.techfak.Part01_29_Adulthood;

import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("How old are you?");
        int a = Integer.valueOf(scan.nextLine());
        if(a>17){
            System.out.println("You are an adult.");
        }else{
            System.out.println("You are not an adult.");
        }
    }
}
