package PRActical_q;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the equal sides: ");
        double equalSide = scanner.nextDouble();

        System.out.print("Enter length of the base: ");
        double base = scanner.nextDouble();

        // Calculate height using Pythagoras theorem
        double height = Math.sqrt(equalSide * equalSide - (base * base) / 4);

        // Calculate area
        double area = 0.5 * base * height;

        System.out.printf("Area of the isosceles triangle = %.2f\n", area);

        scanner.close();
    }
}
