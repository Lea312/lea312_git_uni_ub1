package de.techfak.Part01_31_GradesAndPoints;

import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //mein code hier:

        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scan.nextLine());
        System.out.println("Grade: ");
        if (grade < 0) {
            System.out.print("impossible!");
        } else if(grade >= 100){
            System.out.print("incredible!");
        } else if(grade <100 && grade >=90){
            System.out.print("5");
        } else if(grade <90 && grade >=80){
            System.out.print("4");
        } else if(grade <80 && grade >= 70){
            System.out.print("3");
        } else if(grade <70 && grade >=60){
            System.out.print("2");
        } else if(grade <60 && grade >=50){
            System.out.print("1");
        } else if(grade <=49 && grade >=0) {
            System.out.print("failed");
        }

    }
}
