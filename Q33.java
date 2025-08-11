package PRActical_q;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the parallelogram: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the parallelogram: ");
        double breadth = scanner.nextDouble();

        double perimeter = 2 * (length + breadth);

        System.out.printf("Perimeter of the parallelogram = %.2f\n", perimeter);

        scanner.close();
    }
}
