package PRActical_q;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int count = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        double average = sum / count;
        System.out.println("Average = " + average);

        scanner.close();
    }
}

