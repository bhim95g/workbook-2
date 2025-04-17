package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your serial number: ");
        String serialNumber = input.nextLine();

        System.out.print("Please enter your model: ");
        String model = input.nextLine();

        System.out.print("Please enter your carrier name: ");
        String carrier = input.nextLine();

        System.out.println("Please enter your phone number: ");
        String phoneNumber = input.nextLine();

        System.out.print("Please enter your name");
        String Owner = input.nextLine();




    }
}
