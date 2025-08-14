package PRActical_q;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the square: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;

        System.out.printf("Perimeter of the square = %.2f\n", perimeter);

        scanner.close();
    }
}
