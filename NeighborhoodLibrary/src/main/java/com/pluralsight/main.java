package com.pluralsight;
import java.util.Scanner;

public class main {
    public main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Book id: ");
        String id = input.nextLine();

        System.out.print("Please enter your isbn: ");
        String isbn = input.nextLine();

        System.out.print("Please enter your Book title: ");
        String title = input.nextLine();

        System.out.println("Please enter your isCheckedOut: ");
        String isCheckedOut = input.nextLine();

        System.out.print("Please enter your checkedOutTo");
        String checkedOutTo = input.nextLine();


    }
}
