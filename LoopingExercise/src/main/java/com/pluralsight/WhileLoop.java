package com.pluralsight;
public class WhileLoop {
    public static void main(String[] args) {
        int count= 0;
        while(count < 5) {
            System.out.println("I love java");
            int i = count++; //negate condition after 5ish times
        }
    }
}
