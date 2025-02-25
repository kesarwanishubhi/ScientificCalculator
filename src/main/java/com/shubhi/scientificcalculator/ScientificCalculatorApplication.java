package com.shubhi.scientificcalculator;

import com.shubhi.scientificcalculator.service.CalculatorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ScientificCalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(ScientificCalculatorApplication.class, args);
        CalculatorService calculatorService = new CalculatorService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Scientific Calculator Menu ---");
            System.out.println("1. Square Root");
            System.out.println("2. Power");
            System.out.println("3. Sine");
            System.out.println("4. Cosine");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    System.out.println("Square Root: " + calculatorService.squareRoot(num));
                    break;

                case 2:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power Result: " + calculatorService.power(base, exponent));
                    break;

                case 3:
                    System.out.print("Enter angle (degrees): ");
                    double angleSin = scanner.nextDouble();
                    System.out.println("Sine Result: " + calculatorService.sine(angleSin));
                    break;

                case 4:
                    System.out.print("Enter angle (degrees): ");
                    double angleCos = scanner.nextDouble();
                    System.out.println("Cosine Result: " + calculatorService.cosine(angleCos));
                    break;

                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }

}
