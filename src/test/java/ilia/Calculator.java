package ilia;

import org.bouncycastle.jcajce.provider.symmetric.Skipjack;
import org.testng.SkipException;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Calculator {
    private static final  String green = "\u001B[32m";
    private static void color(String text , String colorCode)
    {
        System.out.println(colorCode + text + "\u001B[0m");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Timer timer = new Timer();
        long time = 90000;

        int correct = 0;
        int incorrect = 0;

        String[] positiveComments = {"Good job!", "Amazing!","Awesome!","Great!","Well done!","Fantastic!","Excellent!","Impressive!"};
        String[] negativeComments = {"Oops(","Don't worry!","Wrong!","Almost there(","Don't give up!","Nice try, but not quite"};

        System.out.println("      Welcome To Math Challenge! ");

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Choose difficulty level: ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.print("Put a number of your difficult: ");
        int choice = scanner.nextInt();
        int size = 0;
        int maxNumber = 0;
        switch (choice)
        {
            case 1 ->
            {
                System.out.println("Your choice *Easy*");
                size = 5;
                maxNumber = 10;
                break;
            }
            case 2 ->
            {
                System.out.println("Your choice **Medium**");
                size = 10;
                maxNumber = 50;
                break;
            }
            case 3 ->
            {
                System.out.println("Your choice ***Hard***");
                size = 10;
                maxNumber = 100;
                break;
            }
            default ->
            {
                System.err.println("Wrong Choice!");
            }
        }

        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        for (int i = 0; i < size; i++)
        {
            System.out.println("You have " + size + " tasks to solve. Good Luck!) ");
            int firstNumber = random.nextInt(maxNumber);

            char[] operators = {'*', '+', '/', '-'};
            char operator = operators[random.nextInt(operators.length)];

            int secondNumber = random.nextInt(maxNumber);

            System.out.println("Calculate the following: ");
            System.out.println("*****************************");
            System.out.println("Task: "+ firstNumber + " " + operator + " " + secondNumber);
            System.out.println("*****************************");

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
                        result = (double) firstNumber / secondNumber;
                    }
                    else if (firstNumber < secondNumber)
                        {
                            System.out.println("Else");
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
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.print("Your Answer: ");
            double userAnswer = scanner.nextDouble();

            if (userAnswer == result) {
                color("Correct!", green);
                color(positiveComments[random.nextInt(positiveComments.length)], green);
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
        color("Your correct answer(s): " + correct , green);
        System.err.println("Your incorrect answer(s):" + incorrect);
    }
}
