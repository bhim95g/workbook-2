package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        int count = 10;

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Lunch");
    }
}
