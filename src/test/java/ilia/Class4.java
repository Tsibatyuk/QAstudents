package ilia;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Class4 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();
        System.out.print("How much books person take " + numberInput);

        int wantGive = scanner.nextInt();
        if(wantGive > 0)
        {
            System.out.print("Person want give " + wantGive + "book");
        }
        else
        {
            System.out.print("Person don't give new " + wantGive + "book");
        }
        int sum = numberInput + wantGive;
        System.out.println("Person have sam of book = " + sum );
        if(sum > 10)
        {
            int excessiveBook = sum - 1 ;
            int penalty = excessiveBook*10;
            System.out.println("Person give on "+excessiveBook+" book much and need pay 10 dollars. Your penalty equel to "+excessiveBook+"  " );
        }

    }
}
