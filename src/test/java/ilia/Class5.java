package ilia;

import java.util.Scanner;

public class Class5 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberInput = scanner.nextInt();
        System.out.println("How much book person have " + numberInput);

        int wantTake = scanner.nextInt();
        if(wantTake > 0)
        {
            System.out.println("Person wants take " + wantTake + "books");
        }
        else if(wantTake < 0)
        {
            System.out.println("Error. Books can not negative number ");
        }
        else
        {
            System.out.println("Person doesn't want to take new books ");
        }

        if (wantTake > 0)
        {
            int sum = numberInput + wantTake;
            System.out.println("Person has " + sum + "books ");
            if(sum > 10)
            {
                int excessiveBook = sum - 10;
                int penalty = excessiveBook * 10;
                System.out.println("Person has" + excessiveBook + "excess book. You need to pay 10 dollars and your penalty " + penalty );
        }
        }
        else
        {
            System.out.println("Person can't give negative books");
        }

    }
}
