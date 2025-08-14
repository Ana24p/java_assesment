package PRActical_q;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.printf("Perimeter (Circumference) of the circle = %.2f\n", perimeter);

        scanner.close();
    }
}

