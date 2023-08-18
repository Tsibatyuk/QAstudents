package olena;

import java.util.Scanner;

public abstract class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        String a = scanner.next();
        int s = scanner.nextInt();
        int b = q-s;

        System.out.println(b);



    }

    public abstract int calculate(int a, int b);
}
