package pisun;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Zadascha {


    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
 int zad = scanner.nextInt();
        System.out.println("читач взяв " + zad+" книжок");
    int kracen = scanner.nextInt();
        if (kracen > 0) {

            System.out.println("читач хоче взяти ще "+kracen+" стільки книг");
        }
        else {
            System.out.println("читач невзяв жодної нової книжки");
        }
        int sasha = kracen + zad;

        System.out.println("читач в сумі матиме "+sasha+" кількість книжок");
    if (sasha > 10){
        int loj = sasha - 10;
        int apple = loj * 10;
        System.out.println("читач взяв настільки "+ loj+"книжок більше і мусить заплатити штраф по 10 грошей за кожну книгу .В сумі дорінює"+apple);
    }
        }

}

