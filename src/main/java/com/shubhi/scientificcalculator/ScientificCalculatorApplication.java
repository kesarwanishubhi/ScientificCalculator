//package com.shubhi.scientificcalculator;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.Scanner;
//
//@SpringBootApplication
//public class ScientificCalculatorApplication {
//
//    public static void main( String[] args ) {
//        char ch = 'y';
//        System.out.println("------ Simple Calculator Program ------");
//        Scanner sc = new Scanner(System.in);
//        CalculatorFunctions fun = new CalculatorFunctions();
//        while(ch == 'y') {
//            System.out.print("1. Square root of a number \n2. Factorial of a number \n3. Natural Log of a number \n4. Power of a number \nEnter the operation you want to perform(1, 2, 3 or 4): ");
//
//            int op = sc.nextInt();
//            switch(op) {
//                case 1:
//                    System.out.print("\nEnter the number: ");
//                    System.out.println("\nSquare root is: " + fun.sqrt(sc.nextDouble()));
//                    break;
//                case 2:
//                    System.out.print("\nEnter the number: ");
//                    System.out.println("\nFactorial is: " + fun.fact(sc.nextInt()));
//                    break;
//                case 3:
//                    System.out.print("\nEnter the number: ");
//                    System.out.println("\nNatural Log is: " + fun.log(sc.nextDouble()));
//                    break;
//                case 4:
//                    System.out.print("\nEnter the numbers: ");
//                    double a = sc.nextDouble();
//                    double b = sc.nextDouble();
//                    System.out.println("\nPower is: " + fun.pow(a, b));
//                    break;
//                default : System.out.println("\n------ Wrong choice ------");
//                    break;
//            }
//
//            System.out.print("\nDo you want to perform any other operation? Press y or n: ");
//            ch = sc.next().charAt(0);
//        }
//
//        System.out.println("\n------ Ending Of Program ------");
//    }
//
//}
package com.shubhi.scientificcalculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ScientificCalculatorApplication {

    public static void main(String[] args) {
        // Skip execution during Jenkins build
        if (System.getenv("JENKINS_HOME") != null) {
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.flush();

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting.");
                break;
            }

            System.out.print("Enter value of x: ");
            System.out.print("This is test statement");
            double x = scanner.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("√" + x + " = " + Math.sqrt(x));
                case 2 -> System.out.println(x + "! = " + factorial((int) x));
                case 3 -> System.out.println("ln(" + x + ") = " + Math.log(x));
                case 4 -> {
                    System.out.print("Enter value b: ");
                    double b = scanner.nextDouble();
                    System.out.println(x + "^" + b + " = " + Math.pow(x, b));
                }
                default -> System.out.println("Invalid choice..Try again.");
            }
        }
        scanner.close();
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) return 1;
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}