package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("\nBasic Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            if (choice == 5) {
                continueCalculating = false;
                System.out.println("Goodbye!");
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select 1-5.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1;
            try {
                num1 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid number.");
                scanner.nextLine();
                continue;
            }

            System.out.print("Enter second number: ");
            double num2;
            try {
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid number.");
                scanner.nextLine();
                continue;
            }

            double result;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    result = divide(num1, num2);
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
                    break;
            }
        }
        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}