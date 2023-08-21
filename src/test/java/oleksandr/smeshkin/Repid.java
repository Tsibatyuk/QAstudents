package oleksandr.smeshkin;

import java.util.Scanner;

public class Repid{
public static void main(String[]args) {
        Scanner sistem = new Scanner(System.in);
        String BMW = sistem.nextLine();
        System.out.println(" клієнт взяв в оренду " + BMW + " авто");
        int avtoorenda = sistem.nextInt();
        if (avtoorenda <= 20) {

                System.out.println("клієнт бере в оренду ще " + avtoorenda + " моделей авто ");
        } else if (avtoorenda <=0) {
                System.out.println("клієнт не взяв жодного авто в оренду");
        } else if (avtoorenda>20) {
                System.out.println("клієнт візьме більше 20 авто ");
        }


}
}



