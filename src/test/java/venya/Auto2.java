package venya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auto2 {

    public static void main(String[] args) {
        List<String> qm = new ArrayList<>();

        qm.add("BMW");
        qm.add("Mercedes");
        qm.add("Toyota");
        qm.add("Tesla");
        qm.add("Volvo");
        qm.add("Kia");
        qm.add("Ford");
        qm.add("Bugatti");
        qm.add("Lamborghini");
        qm.add("Chevrolet");


        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть букву");
        String input = scanner.nextLine();

        List<String> filteredCars = qm.stream()
                .filter(car -> car.startsWith(input))
                .toList();

        System.out.println("cars starting with '" + input + "': " + filteredCars);
    }

}
