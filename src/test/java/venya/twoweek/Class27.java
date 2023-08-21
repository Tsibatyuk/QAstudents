package venya;

import java.util.ArrayList;
import java.util.List;

public class Class27 {

    public static void main(String[] args) {
        List<String> qm = new ArrayList<>();

        qm.add("BMW");
        qm.add("Mercedes");
        qm.add("Toyota");
        qm.add("Honda");
        qm.add("Volvo");
        qm.add("Kia");
        qm.add("Ford");
        qm.add("Bugatti");
        qm.add("Lamborghini");
        qm.add("Chevrolet");


        qm.stream()
                .filter(car -> car.startsWith("C"))
                .forEach(System.out::println);
    }

}








