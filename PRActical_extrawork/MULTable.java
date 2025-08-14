package PRActical_extrawork;

import java.util.Scanner;

public class MULTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to display its multiplication table: ");
        
        // Read the number from user input
        int number = scanner.nextInt();

        // Print multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close(); // Close the scanner
    }
}

