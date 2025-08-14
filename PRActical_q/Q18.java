package PRActical_q;

import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        scanner.close();
    }
}

