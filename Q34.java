package PRActical_q;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        double perimeter = 2 * (length + breadth);

        System.out.printf("Perimeter of the rectangle = %.2f\n", perimeter);

        scanner.close();
    }
}
