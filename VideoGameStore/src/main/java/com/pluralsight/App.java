package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        VideoGame game = new VideoGame();

        System.out.println("Welcome to the video Game Inventory System");

        System.out.println("--- You will need to insert the new video game---");
        System.out.println("\n");

        System.out.println("Please enter the name of your video game: ");
        game.setName(keyboardInput.nextLine());
    }
}
