package zhenia;

import org.testng.annotations.Test;

import java.util.Scanner;

public class FirstClass {


    int x = 1;

    @Test
    public void cold() {
        while (x < 10) {
            x++;
            System.out.println(x);

        }
        if (x==10){
            System.out.println("x дорівнює 10");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(x);
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("вибери цифру від '1', '2' або '3'");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("Ви можете вибрати подарунок 10 або 11 доларів");
            number = sc.nextInt();
            if (number == 10) {
                System.out.println("ви вибрали 10");
            } else if  (number == 11) {
                System.out.println("ви вибрали 11");
            } else {
                System.out.println("ви вибрали не правильний бонус");
            }

        }

        if (number == 2) {
            System.out.println("Ви можете вибрати подарунок 20 або 22 доларів");

        }
        if (number == 3) {
            System.out.println("Ви можете вибрати подарунок 30 або 33 доларів");
        } else {
            System.out.println("ви вибрали не правильну цифру");
        }

    }


}
