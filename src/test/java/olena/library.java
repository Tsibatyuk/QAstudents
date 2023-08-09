package olena;

import java.sql.SQLOutput;
import java.util.Scanner;

public class library {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int коля = scanner.nextInt();
        System.out.println("читач взяв в бібліотеці таку кількість книг " + коля);
        int оля = scanner.nextInt();
        if (оля > 0) {
            System.out.println("читач хоче взяти ще стільки книг" + оля);

        } else {
            System.out.println("читач не взяв жодної нової книги");
        }
            int женя = коля + оля;
            System.out.println("читач в сумі матиме таку кількість книжок" + женя);
            if (женя > 10){
           int валя = женя - 10;
                int міша = валя * 10;
                System.out.println("читач взяв на стільки "+ валя +"книжок більше і мусить заплатити штраф по 10 грошей за книгу. в сумі штраф дорівнює "+міша );


            }
        }

    }

