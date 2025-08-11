package PRActical_q;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();

        double totalMarks = 0;
        System.out.println("Enter marks out of 100 for each subject:");

        for (int i = 1; i <= n; i++) {
            System.out.print("Subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        // Calculate percentage
        double percentage = totalMarks / n;

        // Convert to CGPA scale (assuming CGPA out of 10)
        double cgpa = percentage / 10;

        System.out.printf("CGPA = %.2f\n", cgpa);

        scanner.close();
    }
}
