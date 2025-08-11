package PRActical_q;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the rhombus: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;

        System.out.printf("Perimeter of the rhombus = %.2f\n", perimeter);

        scanner.close();
    }
}
