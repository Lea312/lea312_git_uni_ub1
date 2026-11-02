package de.techfak.Part01_37_GiftTax;

import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //mein Code hier
        System.out.println("Value of the gift?");
        int a = Integer.valueOf(scan.nextLine());
        double steuer = 0;
        if(a <5000){
            System.out.println("No tax!");
        }else if(a>5000 && a<25000){
            steuer = 100+((a-5000)*0.08);
            System.out.println("Tax: " + steuer);
        }else if(a>25000 && a <55000){
            steuer = 17000+((a-25000)*0.1);
            System.out.println("Tax: " + steuer);
        } else if(a>55000 && a<200000) {
            steuer = 22100 + ((a - 55000) * 0.15);
            System.out.println("Tax: " + steuer);
        }else if(a>200000 && a < 1000000){
            steuer = 142100 + ((a-200000)*0.17);
            System.out.println("Tax: " + steuer);

        }

    }
}
