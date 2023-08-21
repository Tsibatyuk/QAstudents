package venya.twoweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class0 {

    public static void main(String[] args) {
        List<String> qmm = new ArrayList<>();

        qmm.add("BMW");
        qmm.add("Mercedes");
        qmm.add("Toyota");
        qmm.add("Honda");
        qmm.add("Volvo");
        qmm.add("Kia");
        qmm.add("Ford");
        qmm.add("Bugatti");
        qmm.add("Lamborghini");
        qmm.add("Chevrolet");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть букву");
        String auto = scanner.nextLine();

        List<String> cars = qmm.stream()
        .filter(car -> car.startsWith(auto))
        .toList();
        System.out.println("авто,яке починається на букву " + auto + " : " + cars);


    }
}
