package venya;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = scanner.nextInt();

        System.out.println("Enter an operation (+,-,/,*):");
        String operation = scanner.next();

        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        int result = 0;
        if (operation.equals("+")) {
            result = a + b;
        } else if (operation.equals("-")) {
            result = a - b;
        } else if (operation.equals("/")) {
            result = a / b;
        } else if (operation.equals("*")) {
            result = a * b;


        }

        System.out.println(" result : " + result);

        }

    }
