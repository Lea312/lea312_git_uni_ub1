package de.techfak.Part01_30_LargerThanOrEqualTo;

import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // mein Code hier? lol

        System.out.println("Give the first number:");
        int a = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scan.nextLine());
        if(a>b){
            System.out.print("Greater number is: " + a);
        } else if(b>a){
            System.out.print("Greater number is: " + b);
        } else{
            System.out.print("The numbers are equal!");
        }
    }
}
