package PRActical_extrawork;
import java.util.Scanner;

public class Student {
    int rollno;
    String name;
    double percentage;
    // Default constructor
    Student() {
        this.rollno = 0;
        this.name = "Unknown";
        this.percentage = 0.0;
    }
    // Parameterized constructor
    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }
    // Display method
    void display() {
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("Percentage: " + this.percentage);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        System.out.println("Enter details of 5 students:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter percentage: ");
            double perc = sc.nextDouble();
            students[i] = new Student(roll, name, perc);
        }
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
