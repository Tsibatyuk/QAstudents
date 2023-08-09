package venya;

import java.util.Scanner;

public class Class1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int book = scanner.nextInt();
        System.out.print("читач взяв в библіотеці таку кількість книг "+ book);
        int book2 = scanner.nextInt();
        if (book2>0) {
            System.out.println("людина бере в бібліотеці " + book2 + " книг");
        }else {
            System.out.println("читач не взяв жодної нової книги");
        }
        int сумакнижок = book + book2;
        System.out.println("читач сумарно має таку суму книжок" + сумакнижок);
        if (сумакнижок >10) {
            int кількистьнадлишковихкнижок = сумакнижок - 10;
            int штраф = кількистьнадлишковихкнижок *10;
            System.out.println("людина взяла на "+кількистьнадлишковихкнижок+" книжок більше і мусить заплатити штраф по 10 грошей за кожну книжку. В сумі штраф дорівнює " + штраф );
        }



    }
}
