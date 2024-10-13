// Import the Scanner class to enable user input
import java.util.Scanner;

public class Inputsum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();  // Capture the first integer input

        // Prompt the user to enter the second number
        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();  // Capture the second integer input

        // Prompt the user to enter the third number
        System.out.println("Enter num3: ");
        int num3 = scanner.nextInt();  // Capture the third integer input

        // Calculate the sum of the three numbers
        int sum = num1 + num2 + num3;

        // Display the sum of the three numbers
        System.out.println("The sum of num1, num2, and num3 is: " + sum);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
