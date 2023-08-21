package olena;

import java.util.Scanner;

public abstract class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть першу цифру: ");
        int a = scanner.nextInt();

        System.out.println("Оберіть другу цифру: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Оберіть дію: ");
        char d = scanner.nextLine().charAt(0);

        int c = 0;
        switch (d) {
            case '+':
                c = a + b;
                System.out.println("Відповідь: " + c);
                break;
            case '-':
                c = a - b;
                System.out.println("Відповідь: " + c);
                break;
            case '*':
                c = a * b;
                System.out.println("Відповідь: " + c);
                break;

            case '/':
                if (b == 0)
                    System.err.println("Помилка");

                else if (c == (a / b)) ;
                System.out.println("Відповідь: " + c);
                break;
            default:
                System.err.println("Помилка");
        }

    }

    public abstract int calculate(int a, int b);
}
