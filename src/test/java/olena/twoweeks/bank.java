package olena.twoweeks;

import java.util.Scanner;

public class bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kredit = scanner.nextInt();
        System.out.println("сума "+ kredit +" вже отриманого кредиту");
        int morekredit = scanner.nextInt();
        if (morekredit > 0) {
            System.out.println("сума " + morekredit + " як додатковий кредит ");
        } else {
            System.out.println("кредитор не взяв грошей ");}
            int summ = kredit + morekredit;
            System.out.println("повна сумма кредиту " + summ );
            if (summ > 100000) {
                int morelimit = summ - 100000;
                int penaly = morelimit * 10;
                System.out.println("кредит був переви на " + morelimit + " через що кретор має ваплатити штраф 10% від суми надлишку, яка складе "+ penaly);
            }

        }
    }


