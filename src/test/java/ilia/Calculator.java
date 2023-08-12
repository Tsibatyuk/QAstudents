package ilia;

import org.bouncycastle.jcajce.provider.symmetric.Skipjack;
import org.testng.SkipException;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Timer timer = new Timer();
        long time = 60000;

        int size = 5;
        int correct = 0;
        int incorrect = 0;
        String[] positiveComments = {"Good job", "Amazing!","Awesome","Great","Well done"};
        String[] negativeComments = {"Oops","Don't worry","Wrong","Almost there "};
        for (int i = 0; i < size; i++)
        {
            int firstNumber = random.nextInt(100);

            char[] operators = {'*', '+', '/', '-'};
            char operator = operators[random.nextInt(operators.length)];

            int secondNumber = random.nextInt(100);

            System.out.println("Calculate the following: ");
            System.out.println(firstNumber + " " + operator + " " + secondNumber);

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Your Time Up!");
                    System.exit(0);
                }
            }, time);

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            double result = 0;
            switch (operator)
            {
                case '*' ->
                {
                    result = firstNumber * secondNumber;
                    break;
                }
                case '+' ->
                {
                    result = firstNumber + secondNumber;
                    break;
                }
                case '/' ->
                {
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    }
                    else if (firstNumber < secondNumber)
                        {
                            System.out.println("Error");
                            correct++;
                        }
                    else
                        System.out.println("Error!");
                    break;
                }
                case '-' ->
                {
                    result = firstNumber - secondNumber;
                    break;
                }
                default ->
                {
                    System.err.println("Wrong operator");
                    return;
                }
            }

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.print("Your Answer: ");
            double userAnswer = scanner.nextDouble();

            if (userAnswer == result) {
                System.out.println("Correct!");
                System.out.println(positiveComments[random.nextInt(positiveComments.length)]);
                System.out.println(" ");
                correct++;
            } else {
                System.err.println("Incorrect!");
                System.out.println("Correct Answer: " + result);
                System.out.println(" ");
                System.err.println(negativeComments[random.nextInt(negativeComments.length)]);
                System.out.println(" ");
                incorrect++;
            }

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Your correct answer(s): " + correct);
        System.err.println("Your incorrect answer(s):" + incorrect);
    }
}
