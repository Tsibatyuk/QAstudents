package olena;

import java.sql.SQLOutput;
import java.util.Scanner;

public class library {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int винен = scanner.nextInt();
        System.out.println("читач взяв в бібліотеці таку кількість книг " + винен);
        int взяти = scanner.nextInt();
        if (взяти > 0) {
            System.out.println("читач хоче взяти ще стільки книг" + взяти);

        } else {
            System.out.println("читач не взяв жодної нової книги");
        }
            int сума = винен + взяти;
            System.out.println("читач в сумі матиме таку кількість книжок" + сума);
            if (сума > 10){
           int різниця = сума - 10;
                int кількістьбільша = різниця * 10;
                System.out.println("читач взяв на стільки "+ різниця +"книжок більше і мусить заплатити штраф по 10 грошей за книгу. в сумі штраф дорівнює "+кількістьбільша );


            }
        }

    }

