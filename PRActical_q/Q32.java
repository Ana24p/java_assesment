package PRActical_q;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the equilateral triangle: ");
        double side = scanner.nextDouble();

        double perimeter = 3 * side;

        System.out.printf("Perimeter of the equilateral triangle = %.2f\n", perimeter);

        scanner.close();
    }
}
