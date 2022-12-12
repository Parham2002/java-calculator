package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static void calculator() {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Input first value: ");
            double valOne = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Input operator: ");
            String operator = scanner.nextLine();
            System.out.println("Input second value: ");
            double valTwo = scanner.nextFloat();
            scanner.nextLine();

            switch (operator) {
                case "+":
                    result = valOne + valTwo;
                    break;
                case "-":
                    result = valOne - valTwo;
                    break;
                case "*":
                    result = valOne * valTwo;
                    break;
                case "/":
                    result = valOne / valTwo;
                    break;
                default:
                    System.out.println("Wrong output.");
                    continue;
            }

            System.out.printf("The result of (%s %s %s) is %s", valOne, operator, valTwo, new DecimalFormat("#.######").format(result));
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Main.calculator();
    }
}