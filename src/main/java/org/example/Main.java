package org.example;

import java.util.Scanner;

public class Main {


    static void calculator() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("Input first value: ");
            int valOne = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input operator: ");
            String operator = scanner.nextLine();
            System.out.println("Input second value: ");
            int valTwo = scanner.nextInt();
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

            System.out.printf("The result of (%d %s %d) is %d", valOne, operator, valTwo, result);
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Main.calculator();
    }
}