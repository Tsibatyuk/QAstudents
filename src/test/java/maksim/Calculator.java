package maksim;

import org.openqa.selenium.support.ui.Wait;

import java.util.Scanner;

public class Calculator {

            public static void main(String[] args) {
                int num1 = getInt();
                int num2 = getInt();
                char operation = getOperation();
                int result = calc(num1, num2, operation);
                System.out.println(result);
            }

            public static int getInt() {
                Scanner scan = new Scanner(System.in);
                System.out.print("Введіть число: ");
                int num;
                if (scan.hasNextInt()) {
                    num = scan.nextInt();
                } else {
                    System.out.println("Помилка");
                    num = getInt();
                }
                return num;
            }

            public static char getOperation() {
                Scanner sc = new Scanner(System.in);
                char operation;
                if (sc.hasNext()) {
                    operation = sc.next().charAt(0);
                } else {
                    System.out.println("Помилка");
                    operation = getOperation();
                }
                return operation;
            }

            public static int calc(int num1, int num2, char operation) {
                int result;
                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Помилка");
                            result = calc(num1, getInt(), operation);
                        }
                        break;
                    default:
                        System.out.println("Помилка");
                        result = calc(num1, num2, getOperation());
                }
                return result;
            }         }

