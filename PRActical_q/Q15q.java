package PRActical_q;

import java.util.Scanner;

public class Q15q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1D Array
        System.out.print("Enter size of 1D array: ");
        int n1 = scanner.nextInt();
        int[] arr1D = new int[n1];
        System.out.println("Enter " + n1 + " elements for 1D array:");
        for (int i = 0; i < n1; i++) {
            arr1D[i] = scanner.nextInt();
        }

        // Display 1D array
        System.out.print("1D Array: ");
        for (int val : arr1D) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 2D Array
        System.out.print("Enter rows for 2D array: ");
        int r2 = scanner.nextInt();
        System.out.print("Enter columns for 2D array: ");
        int c2 = scanner.nextInt();
        int[][] arr2D = new int[r2][c2];
        System.out.println("Enter elements for 2D array:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2D[i][j] = scanner.nextInt();
            }
        }

        // Display 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Array
        System.out.print("Enter depth for 3D array: ");
        int d3 = scanner.nextInt();
        System.out.print("Enter rows for 3D array: ");
        int r3 = scanner.nextInt();
        System.out.print("Enter columns for 3D array: ");
        int c3 = scanner.nextInt();
        int[][][] arr3D = new int[d3][r3][c3];
        System.out.println("Enter elements for 3D array:");
        for (int i = 0; i < d3; i++) {
            System.out.println("Depth " + (i + 1) + ":");
            for (int j = 0; j < r3; j++) {
                for (int k = 0; k < c3; k++) {
                    arr3D[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Display 3D array
        System.out.println("3D Array:");
        for (int i = 0; i < d3; i++) {
            System.out.println("Depth " + (i + 1) + ":");
            for (int j = 0; j < r3; j++) {
                for (int k = 0; k < c3; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
