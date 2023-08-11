package olena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class avto2 {
    public static void main(String[] args) {

        List<String> as = new ArrayList<>();

        as.add("Audi");
        as.add("BMW");
        as.add("Mercedes");
        as.add("Opel");
        as.add("Kia");
        as.add("Ford");
        as.add("Chevrolet");
        as.add("Toyota");
        as.add("Volkswagen");
        as.add("Tesla");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter:  ");
        String input = scanner.nextLine();

        List<String> filteredCars = as.stream()
                .filter(car -> car.startsWith(input))
                .toList();

        System.out.println("Cars starting with '" + input + "': " + filteredCars);
    }

}






