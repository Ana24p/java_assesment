package PRActical_q;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q11 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String ageInput = reader.readLine();
            int age = Integer.parseInt(ageInput);

            System.out.println("Hello, " + name + ". You are " + age + " years old.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }
}

