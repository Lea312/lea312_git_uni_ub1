package de.techfak.Part01_34_Same;

import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Give the first string:");
        String a = scan.nextLine();
        System.out.println("Give the second string:");
        String b = scan.nextLine();
        if(a.equals(b)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
