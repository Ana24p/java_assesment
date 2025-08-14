package PRActical_extrawork;

import java.util.Scanner;

public class FActnu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close(); // Close the scanner
    }
}
