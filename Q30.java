package PRActical_q;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = scanner.nextDouble();

        // Formula: (sqrt(3)/4) * side^2
        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.printf("Area of the equilateral triangle = %.2f\n", area);

        scanner.close();
    }
}

