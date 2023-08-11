package ilia;

import java.util.*;

public class Class8 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number = ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter your operator( + , * , - , /) ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter your second number = ");
        double secondNumber = scanner.nextDouble();

        double result = 0.0;

        switch (operator)
        {
            case '+':
                result = firstNumber + secondNumber;
            break;
            case '-':
                result = firstNumber - secondNumber;
            break;
            case '*':
                result = firstNumber * secondNumber;
            break;
            case '/':
                if (secondNumber != 0)
                {
                    result = firstNumber / secondNumber;
                }
                else
                {
                    System.err.println("Error, you can not divide for zero");
                    return;
                }
            break;
            default:
                System.err.println("Wrong operator");
            return;
        }
        System.out.println("Result = " + result);


    }
}
