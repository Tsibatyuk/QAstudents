package olena;

import java.util.ArrayList;
import java.util.List;

public class avto1 {
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

        List<String> filteredCars = as.stream()
                .filter(car -> car.startsWith("O"))
                .toList();

        System.out.println("Cars starting with 'O': " + filteredCars);
    }




    }



