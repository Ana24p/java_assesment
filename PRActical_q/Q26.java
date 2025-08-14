package PRActical_q;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;

        System.out.printf("Area of the rectangle = %.2f\n", area);

        scanner.close();
    }
}
